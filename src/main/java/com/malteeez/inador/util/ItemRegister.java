package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.common.items.tiers.MasterTiers;
import com.malteeez.inador.common.items.tool.ItemShiro;
import com.malteeez.inador.init.ModItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings({"unused"})
public class ItemRegister {

    private static String _MODID = InAdor.MODID;

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, _MODID);

    //ITEM MASTER REGISTRY
    public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_RUT = ITEMS.register("ext_rut", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_ICE = ITEMS.register("ext_ice", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_FRG = ITEMS.register("ext_frg", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_GEM = ITEMS.register("ext_gem", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_BRE = ITEMS.register("ext_bre", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_KAT = ITEMS.register("ext_kat", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> HELLO_INVENTORY = ITEMS.register("hello_inventory", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> SHIRO = ITEMS.register("shiro", () -> new ItemShiro(MasterTiers.shiro, 14, 4.0F, ItemShiro.properties.group(ModItemGroups.MOD_ITEM_GROUP)));

    //BLOCKITEMS MASTER REGISTRY
    public static final RegistryObject<Item> SMALLSCREEN = ITEMS.register("smallscreen", () -> new BlockItem(BlockRegister.SMALLSCREEN.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> LEAF_PILE = ITEMS.register("leaf_pile", () -> new BlockItem(BlockRegister.LEAF_PILE.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> HELLO_BLOCKS = ITEMS.register("hello_blocks", () -> new BlockItem(BlockRegister.HELLO_BLOCKS.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> second_block = ITEMS.register("second_block", () -> new BlockItem(BlockRegister.SECOND_BLOCK.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
}
