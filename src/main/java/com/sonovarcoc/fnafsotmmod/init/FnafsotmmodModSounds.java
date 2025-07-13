/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sonovarcoc.fnafsotmmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import com.sonovarcoc.fnafsotmmod.FnafsotmmodMod;

public class FnafsotmmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, FnafsotmmodMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MIMIC_WALK = REGISTRY.register("mimic_walk", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fnafsotmmod", "mimic_walk")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MIMIC_ATTACK = REGISTRY.register("mimic_attack", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fnafsotmmod", "mimic_attack")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MIMIC_DEATH = REGISTRY.register("mimic_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fnafsotmmod", "mimic_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MIMIC_HURT = REGISTRY.register("mimic_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fnafsotmmod", "mimic_hurt")));
}