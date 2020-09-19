package com.example.examplemod.util;

import com.example.examplemod.common.items.tiers.MasterTiers;
import com.example.examplemod.common.items.tool.ItemShiro;
import com.example.examplemod.init.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings({"unused"})
public class ItemRegister {

    private static String _MODID = ExampleMod.MODID;

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, _MODID);

    //ITEM MASTER REGISTRY
    public static final RegistryObject<Item> HELLO_INVENTORY = ITEMS.register("hello_inventory", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> SHIRO = ITEMS.register("shiro", () -> new ItemShiro(MasterTiers.shiro, 120, 9.0F, ItemShiro.properties.group(ModItemGroups.MOD_ITEM_GROUP)));

    //BLOCKITEMS MASTER REGISTRY
    public static final RegistryObject<Item> LEAF_PILE = ITEMS.register("leaf_pile", () -> new BlockItem(BlockRegister.LEAF_PILE.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> HELLO_BLOCKS = ITEMS.register("hello_blocks", () -> new BlockItem(BlockRegister.HELLO_BLOCKS.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> second_block = ITEMS.register("second_block", () -> new BlockItem(BlockRegister.SECOND_BLOCK.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
}
