package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.common.entity.TierKuraArrowEntity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InAdor.MODID)
public class EntityRegistry {


    /** <!----- misc entities -----> **/
    public static final EntityType<TierKuraArrowEntity> KURA_ARROW_ENTITY = register("kura_arrow_entity", EntityType.Builder.<TierKuraArrowEntity>create(TierKuraArrowEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).func_233606_a_(4).func_233608_b_(20));


    @Deprecated public static <T extends Entity> EntityType<T> register(String key, EntityType.Builder<T> builder) {
        return Registry.register(Registry.ENTITY_TYPE, key, builder.build(key));
    }

}
