package com.malteeez.inador.api.anno;

import com.malteeez.inador.api.ability.IAbility;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Ability {

    String NAME();

    Class<? extends IAbility> CLASS();
}
