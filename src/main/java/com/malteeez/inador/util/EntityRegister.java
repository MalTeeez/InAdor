package com.malteeez.inador.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;


public class EntityRegister<T extends IForgeRegistryEntry<T>> {

    private final Class<?> superType;
    private final String modId;
    private boolean seenRegisterEvent = false;
    private final Map<RegistryObject<T>, Supplier<? extends T>> entries = new LinkedHashMap<>();
    private IForgeRegistry<T> type;

    /** <!----- rewriting registries.. -----!> **/

    private EntityRegister(Class<?> type, String modId) {
        this.superType = type;
        this.modId = modId;
    }

    public EntityRegister(IForgeRegistryEntry<T> reg, String modId) {
        this(reg.getRegistryType(), modId);
        this.type = (IForgeRegistry<T>) reg;
    }


    public static <B extends Entity & IForgeRegistryEntry<B>> EntityRegister<B> create(IForgeRegistryEntry<B> reg, String modId) {
        return new EntityRegister<B>(reg, modId);
    }

    public static <B extends Entity & IForgeRegistryEntry<B>> EntityRegister<EntityType<?>> create(Class<?> c, String modid) {
        return new EntityRegister<EntityType<?>>(c, modid);
    }

    public <I extends EntityType<?>> RegistryObject<EntityType<?>> register(final String name, final Supplier<? extends I> sup) {
        if (seenRegisterEvent)
            throw new IllegalStateException("Register event has already been fired!");
        Objects.requireNonNull(name);
        Objects.requireNonNull(sup);
        final ResourceLocation key = new ResourceLocation(modId, name);

        RegistryObject<?> ret;
        if (this.type != null)
            ret = RegistryObject.of(key, this.type);
        else if (this.superType != null)
            ret = of(key, this.superType, this.modId);
        else
            throw new IllegalStateException("Could not create RegistryObject in register");

        if (entries.putIfAbsent((RegistryObject<T>) ret, () -> (T) sup.get().setRegistryName(key)) != null) {
            throw new IllegalArgumentException("Duplicate registration " + name);
        }

        return (RegistryObject<EntityType<?>>) ret;
    }

    private RegistryObject<?> of(ResourceLocation location, Class<?> type, String modId) {
        return RegistryObject.of(location, (Class<T>) type, modId);
    }

}
