package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundRegister {

    private static String _MODID = InAdor.MODID;

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, _MODID);

    //SOUND MASTER REGISTRY
    public static final RegistryObject<SoundEvent> FROST_SHARD_SPAWN = SOUNDS.register("frost_shard.spawn", () -> new SoundEvent(new ResourceLocation(_MODID, "frost_shard.spawn")));
}
