package com.chifou.bulkmod.specialsitems;

import com.chifou.bulkmod.BulkMod;

import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class BatumStick extends Item {
	
	public BatumStick() {
		setUnlocalizedName("batum_stick");
		setCreativeTab(BulkMod.bulktab);
		setTextureName(BulkMod.MODID + ":batum_stick");
		this.setMaxStackSize(1);
		
		
	}
	
	
	@Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		player.addChatMessage(new ChatComponentText("�1Naviguez bien !"));
		EntityBoat boat = new EntityBoat(world);
		boat.setPosition(player.posX, player.posY + 1, player.posZ);
		world.spawnEntityInWorld(boat);
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
