package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.common.armor.ArmorMaterials;
import com.malteeez.inador.common.items.tiers.MasterTiers;
import com.malteeez.inador.common.items.tool.FrostShard;
import com.malteeez.inador.common.items.tool.ItemShiro;
import com.malteeez.inador.init.ModItemGroups;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
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
    public static final RegistryObject<Item> EXT_STR = ITEMS.register("ext_str", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_RUT = ITEMS.register("ext_rut", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> FROST_SHARD = ITEMS.register("frost_shard", () -> new FrostShard(MasterTiers.iceSword, 16, 5.0F, FrostShard.properties.group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_FRG = ITEMS.register("ext_frg", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_GEM = ITEMS.register("ext_gem", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_BRE = ITEMS.register("ext_bre", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> EXT_KAT = ITEMS.register("ext_kat", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> HELLO_INVENTORY = ITEMS.register("hello_inventory", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> SHIRO = ITEMS.register("shiro",
            () -> new ItemShiro(MasterTiers.shiro, 14, 4.0F, ItemShiro.properties.group(ModItemGroups.MOD_ITEM_GROUP)));

    //ARMOR ITEMS
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("cloth_helmet",
            () -> new ArmorItem(ArmorMaterials.CLOTH, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("cloth_chestplate",
            () -> new ArmorItem(ArmorMaterials.CLOTH, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("cloth_leggings",
            () -> new ArmorItem(ArmorMaterials.CLOTH, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("cloth_boots",
            () -> new ArmorItem(ArmorMaterials.CLOTH, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

    //BLOCKITEMS MASTER REGISTRY
    public static final RegistryObject<Item> SMALLSCREEN = ITEMS.register("smallscreen", () -> new BlockItem(BlockRegister.SMALLSCREEN.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> LEAF_PILE = ITEMS.register("leaf_pile", () -> new BlockItem(BlockRegister.LEAF_PILE.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> HELLO_BLOCKS = ITEMS.register("hello_blocks", () -> new BlockItem(BlockRegister.HELLO_BLOCKS.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> second_block = ITEMS.register("second_block", () -> new BlockItem(BlockRegister.SECOND_BLOCK.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
}
