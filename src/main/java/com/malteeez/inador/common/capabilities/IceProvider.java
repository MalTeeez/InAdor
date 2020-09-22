package com.malteeez.inador.common.capabilities;

import com.malteeez.inador.api.IIceAbility;
import com.malteeez.inador.api.NBT;

import net.minecraft.util.Direction;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class IceProvider implements ICapabilitySerializable<NBT> {

    // injections
    @CapabilityInject(IIceAbility.class)

    // capability registry
    public static final Capability<IIceAbility> ICE_ABILITY_CAP = null;

    // inst
    private IIceAbility INSTANCE = ICE_ABILITY_CAP.getDefaultInstance();

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return null;
    }

    @Override
    public NBT serializeNBT() {
        return NBT.INSTANCE;
    }

    @Override
    public void deserializeNBT(NBT nbt) {
        ICE_ABILITY_CAP.getStorage().readNBT(ICE_ABILITY_CAP, INSTANCE, null, nbt);
    }
}
