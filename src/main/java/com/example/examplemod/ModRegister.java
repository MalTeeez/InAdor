package com.example.examplemod;

import com.example.examplemod.common.items.tiers.TierShiro;
import com.example.examplemod.common.items.tool.ItemShiro;
import com.example.examplemod.init.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings({"unused"})
public class ModRegister {

    private static String _MODID = ExampleMod.MODID;

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, _MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, _MODID);

    //BLOCK MASTER REGISTRY
    public static final RegistryObject<Block> ROCK = BLOCKS.register("rock", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> HELLO_BLOCKS = BLOCKS.register("hello_blocks", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)));
    public static final RegistryObject<Block> SECOND_BLOCK = BLOCKS.register("second_block", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F, 1.0F)));

    //ITEM MASTER REGISTRY
    public static final RegistryObject<Item> DUST = ITEMS.register("dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HELLO_INVENTORY = ITEMS.register("hello_inventory", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> SHIRO = ITEMS.register("shiro", () -> new ItemShiro(TierShiro.shiro, 120, 9.0F, ItemShiro.properties.group(ModItemGroups.MOD_ITEM_GROUP)));
}
