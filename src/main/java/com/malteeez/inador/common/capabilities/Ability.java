package com.malteeez.inador.common.capabilities;


import com.malteeez.inador.InAdor;
import com.malteeez.inador.api.IIceAbility;
import com.malteeez.inador.api.NBT;

import com.malteeez.inador.common.items.tool.FrostShard;
import com.malteeez.inador.util.ItemRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import javax.annotation.Nullable;

public class Ability  {

    // resource loc

    public static final ResourceLocation ICE_ABILITY_CAP = new ResourceLocation(InAdor.MODID, "ice_ability_cap");

    // sub event
    @SubscribeEvent
    public void attachItemCapability(AttachCapabilitiesEvent<ItemStack> event) {
        if (event.getObject().getItem() instanceof FrostShard) {
            event.addCapability(ICE_ABILITY_CAP, new IceProvider());
        }
    }

    // theatrics broski

    public static Ability NONE = new Ability();
    public static Ability ICE = new Ability();

    private Ability() {

    }

    public static class IceAbilityStorage implements Capability.IStorage<IIceAbility> {

        @Nullable
        @Override
        public INBT writeNBT(Capability<IIceAbility> capability, IIceAbility instance, Direction side) {
           String data = capability + " " + instance + " " + side;
           return (INBT) new NBT(NBT.newOutput(data), " ", 0, NBT.TYPE);
        }

        @Override
        public void readNBT(Capability<IIceAbility> capability, IIceAbility instance, Direction side, INBT nbt) {
            instance.set((float) NBT.INSTANCE.getId());
        }
    }

}


