package com.gargin.cavenoise.entity;

import com.gargin.cavenoise.entity.custom.CaveDwellerEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType.Builder;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
   public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "cavenoise");
   public static final RegistryObject<EntityType<CaveDwellerEntity>> CAVE_DWELLER = ENTITY_TYPES.register(
      "cave_dweller",
      () -> Builder.of(CaveDwellerEntity::new, MobCategory.MONSTER).sized(0.4F, 3.0F).build(new ResourceLocation("cavenoise", "cave_dweller").toString())
   );

   public static void register(IEventBus eventBus) {
      ENTITY_TYPES.register(eventBus);
   }
}
