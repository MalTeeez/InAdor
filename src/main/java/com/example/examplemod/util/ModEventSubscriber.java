package com.example.examplemod.util;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.common.items.tiers.TierShiro;
import com.example.examplemod.common.items.tool.ItemShiro;
import com.example.examplemod.init.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = ExampleMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "hello_inventory"),
                setup(new ItemShiro(TierShiro.shiro, 120, 9.0F, ItemShiro.properties.group(ModItemGroups.MOD_ITEM_GROUP)), "shiro")
        );
    }

    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                setup(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), "hello_blocks"), //still need textures for there dont really know how to implement cuz blocks
                setup(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F, 1.0F)), "second_block")
        );

    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {  //PAIN
        return setup(entry, new ResourceLocation(ExampleMod.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

}
