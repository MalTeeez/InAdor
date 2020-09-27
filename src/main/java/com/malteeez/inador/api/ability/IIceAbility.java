package com.malteeez.inador.api.ability;

import javafx.scene.effect.Effect;
import net.minecraft.entity.LivingEntity;

public interface IIceAbility {

    float set(float id);

    default LivingEntity getAttackEntity(LivingEntity e) {
        return e.getLastAttackedEntity();
    }

    default void effect(Effect eff) {
        // todo apply slowness?
    }

    LivingEntity getTarget();
}
