package com.chifou.bulkmod.registries;

import com.chifou.bulkmod.BulkMod;
import com.chifou.bulkmod.specialsitems.BatumStick;
import com.chifou.bulkmod.specialsitems.ExplosionStick;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemsRegistries {
	
	private static Item explosionStick;
	private static Item batumStick;
	
	public static void init() {
		explosionStick = new ExplosionStick();
		batumStick = new BatumStick();
	}
 	
	public static void register() {
		GameRegistry.registerItem(explosionStick, "explosion_stick");
		GameRegistry.registerItem(batumStick, "batum_stick");
	}

}
