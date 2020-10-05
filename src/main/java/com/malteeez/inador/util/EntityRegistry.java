package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.common.entity.TierKuraArrowEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class EntityRegistry {

    public static final EntityRegister<EntityType<?>> ENTITIES = EntityRegister.create(EntityType.class, InAdor.MODID);

    public static final RegistryObject<EntityType<?>> KURA_ARROW_ENTITY = ENTITIES.register("kura_arrow_entity", (Supplier) EntityType.Builder.<TierKuraArrowEntity>create(TierKuraArrowEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).func_233606_a_(4).func_233608_b_(20));

}
