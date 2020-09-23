package com.malteeez.inador.api.ability;

import com.malteeez.inador.common.capabilities.type.IceAbility;
import javafx.scene.effect.Effect;
import net.minecraft.entity.LivingEntity;

public interface IIceAbility {

    IceAbility ability = new IceAbility();

    float set(float id);

    default LivingEntity getAttackEntity(LivingEntity e) {
        return e.getLastAttackedEntity();
    }

    default void effect(Effect eff) {
        // todo apply slowness?
    }

    LivingEntity getTarget();
}
