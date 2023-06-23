package com.chifou.bulkmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.chifou.bulkmod.proxys.ClientProxy;
import com.chifou.bulkmod.proxys.CommonProxy;
import com.chifou.bulkmod.registries.ItemsRegistries;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BulkMod.MODID, version = BulkMod.VERSION)
public class BulkMod
{
	
	
    public static final String MODID = "bulkmod";
    public static final String VERSION = "1.0";
    public static final String CLIENT_PROXY = "com.chifou.bulkmod.proxys.ClientProxy";
    public static final String COMMON_PROXY = "com.chifou.bulkmod.proxys.CommonProxy";
    public static CreativeTabs bulktab = new CreativeTabs("BulkTab") {
		
		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return Items.apple;
		}
	};
    
    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = COMMON_PROXY)
    public static CommonProxy proxy;
    
    
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	ItemsRegistries.init();
    	ItemsRegistries.register();
    }
    
   
	
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	ClientProxy.registerOverlay();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
    
    
    
    
   
    
    
}
