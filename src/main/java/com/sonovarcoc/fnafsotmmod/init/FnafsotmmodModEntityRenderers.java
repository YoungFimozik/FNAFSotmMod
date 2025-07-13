/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sonovarcoc.fnafsotmmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.sonovarcoc.fnafsotmmod.client.renderer.MimicRenderer;
import com.sonovarcoc.fnafsotmmod.client.renderer.MimicPigRenderer;
import com.sonovarcoc.fnafsotmmod.client.renderer.MimicCowRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FnafsotmmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FnafsotmmodModEntities.MIMIC.get(), MimicRenderer::new);
		event.registerEntityRenderer(FnafsotmmodModEntities.MIMIC_PIG.get(), MimicPigRenderer::new);
		event.registerEntityRenderer(FnafsotmmodModEntities.MIMIC_COW.get(), MimicCowRenderer::new);
	}
}