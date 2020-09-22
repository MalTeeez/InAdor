package com.malteeez.inador.api;

import javafx.scene.effect.Effect;

import javax.swing.text.html.parser.Entity;

public interface IIceAbility {

    float set(float id);

    default void attack(Entity e) {
        // todo will effect entity
        // will probably place an ice block
    }

    default void effect(Effect eff) {
        // todo apply slowness?
    }

    Entity getEntity();
}
