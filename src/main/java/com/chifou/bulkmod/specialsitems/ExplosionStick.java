package com.chifou.bulkmod.specialsitems;

import java.util.logging.Level;

import com.chifou.bulkmod.BulkMod;

import cpw.mods.fml.common.Mod.EventHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCarrotOnAStick;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class ExplosionStick extends Item  {
	
	public ExplosionStick () {
		setUnlocalizedName("explosion_stick");
		setCreativeTab(BulkMod.bulktab);
		setTextureName(BulkMod.MODID + ":explosion_stick");
		this.setMaxStackSize(1);
		
		
	}
	
	
	@Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		player.addChatMessage(new ChatComponentText("�4Boom�c!"));
		world.createExplosion(player, player.posX, player.posY - 6, player.posZ, 250f, true);
		ItemStack heldItem = player.getHeldItem();
		int slot = -1;
		for (int i = 0; i < player.inventory.mainInventory.length; i++) {
		    ItemStack itemStack = player.inventory.mainInventory[i];
		    if (itemStack != null && itemStack == heldItem) {
		        slot = i;
		        break;
		    }
		}
		player.inventory.setInventorySlotContents(slot, null);
        return item;
    }

}
