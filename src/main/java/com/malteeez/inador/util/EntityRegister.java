package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.common.entities.TierTiroSheepEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityRegister {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, InAdor.MODID);

    //Entity Master Registry
    public static final RegistryObject<EntityType<TierTiroSheepEntity>> TIRO_SHEEP = ENTITY_TYPES.register("tiro_sheep", () -> EntityType.Builder.create(TierTiroSheepEntity:: new, EntityClassification.CREATURE).size(1.0F, 1.0F).build(new ResourceLocation(InAdor.MODID, "tiro_sheep").toString()));
}
