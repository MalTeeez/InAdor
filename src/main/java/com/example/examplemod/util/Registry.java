package com.example.examplemod.util;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {
    private static final String _MODID = ExampleMod.MOD_ID;

    public static DeferredRegister<Item> _ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, _MODID);

    public static DeferredRegister<Block> _BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, _MODID);

    /**
    * public static RegistryEvent.NewRegistry _ITEMS = new RegistryEvent.NewRegistry();
     * im not sure about using this (thers 0 to no documentation)
     * so the code im keeping here is DeferredRegistry, but feel free to
     * get the RE.NR to work :)

     * also, add more if needed
     */
}

