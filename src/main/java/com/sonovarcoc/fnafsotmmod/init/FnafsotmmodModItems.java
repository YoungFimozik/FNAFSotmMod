/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sonovarcoc.fnafsotmmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import java.util.function.Function;

import com.sonovarcoc.fnafsotmmod.FnafsotmmodMod;

public class FnafsotmmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FnafsotmmodMod.MODID);
	public static final DeferredItem<Item> MIMIC_SPAWN_EGG = register("mimic_spawn_egg", properties -> new SpawnEggItem(FnafsotmmodModEntities.MIMIC.get(), properties));

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}