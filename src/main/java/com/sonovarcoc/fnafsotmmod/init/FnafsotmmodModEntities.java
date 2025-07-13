/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.sonovarcoc.fnafsotmmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import com.sonovarcoc.fnafsotmmod.entity.MimicPigEntity;
import com.sonovarcoc.fnafsotmmod.entity.MimicEntity;
import com.sonovarcoc.fnafsotmmod.entity.MimicCowEntity;
import com.sonovarcoc.fnafsotmmod.FnafsotmmodMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FnafsotmmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, FnafsotmmodMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<MimicEntity>> MIMIC = register("mimic",
			EntityType.Builder.<MimicEntity>of(MimicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.8f, 2.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicPigEntity>> MIMIC_PIG = register("mimic_pig",
			EntityType.Builder.<MimicPigEntity>of(MimicPigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicCowEntity>> MIMIC_COW = register("mimic_cow",
			EntityType.Builder.<MimicCowEntity>of(MimicCowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1.4f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(FnafsotmmodMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		MimicEntity.init(event);
		MimicPigEntity.init(event);
		MimicCowEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MIMIC.get(), MimicEntity.createAttributes().build());
		event.put(MIMIC_PIG.get(), MimicPigEntity.createAttributes().build());
		event.put(MIMIC_COW.get(), MimicCowEntity.createAttributes().build());
	}
}