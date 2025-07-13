/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sonovarcoc.fnafsotmmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.sonovarcoc.fnafsotmmod.FnafsotmmodMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FnafsotmmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FnafsotmmodMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FnafsotmmodModItems.MIMIC_SPAWN_EGG.get());
		}
	}
}