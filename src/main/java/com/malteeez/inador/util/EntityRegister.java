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

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, InAdor.MODID);

    //Entity Master Registry
    public static final RegistryObject<EntityType<TierTiroSheepEntity>> TIRO_SHEEP = ENTITY_TYPES.register("tiro_sheep", () -> EntityType.Builder.<TierTiroSheepEntity>create(TierTiroSheepEntity::new, EntityClassification.CREATURE).size(1.0F, 1.0F).build(new ResourceLocation(InAdor.MODID, "tiro_sheep").toString()));

    /**
     * possible solutions for above:
     *
     * .func_233606_a_(10)); <-- get this to work, but parameterization & <Type> is failing,
     * so highly unlikely.
     *
     * when setting a breakpoint on this line: it throws a NPE:
     *
     * the general idea im getting from it is:
     * @see net.minecraft.entity.EntityType.IFactory- this.registryFactory = null;
     * which is required for builder (im pretty sure, although it can be generated w/ methods)
     * it doesnt end up seeing the register event
     *
     * and the class fails to load :
     * TierTiroSheepEntity.factory = Class not loaded: com.malteeez.inador.common.entities.TierTiroSheepEntity
     *
     * value ^ null
     *
     * and proceeds to murder.. everything :P - <3
     */
}
