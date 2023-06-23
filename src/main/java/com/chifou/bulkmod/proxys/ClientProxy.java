package com.chifou.bulkmod.proxys;

import com.chifou.bulkmod.proxys.hud.OverlayAstra;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
	
	private static Minecraft mc = Minecraft.getMinecraft();
	
	public static void registerOverlay() {
		MinecraftForge.EVENT_BUS.register(new OverlayAstra());
	}
	
	
	@Override
	public void registerRenders() {
		renderGameOverlayPost(null);
	}
	
	public ClientProxy () {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public static void renderGameOverlayPre(RenderGameOverlayEvent.Pre event) {
		Gui.drawRect(10, 10, 50, 50, Integer.MIN_VALUE);
	}
	
	
	@SubscribeEvent
	public static void renderGameOverlayPost(RenderGameOverlayEvent.Post event) {
		
	}

}
