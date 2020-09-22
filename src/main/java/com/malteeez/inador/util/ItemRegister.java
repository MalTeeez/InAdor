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
        //TIER ITEMS
            //TIER KOZA------------------------------
                public static final RegistryObject<Item> TIER_KOZA_INGOT = ITEMS.register("tier_koza_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> TIER_KOZA_GADGET = ITEMS.register("tier_koza_gadget", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> TIER_KOZA_SCARF = ITEMS.register("tier_koza_scarf", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
            //TIER KURA---------------------------
                public static final RegistryObject<Item> TIER_KURA_INGOT = ITEMS.register("tier_kura_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> TIER_KURA_GADGET = ITEMS.register("tier_kura_gadget", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
            //TIER SHIRO----------------------------
                 public static final RegistryObject<Item> TIER_SHIRO_INGOT = ITEMS.register("tier_shiro_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                 public static final RegistryObject<Item> TIER_SHIRO_GADGET = ITEMS.register("tier_shiro_gadget", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                 public static final RegistryObject<Item> SHIRO = ITEMS.register("shiro",
                    () -> new ItemShiro(MasterTiers.shiro, 14, 4.0F, ItemShiro.properties.group(ModItemGroups.MOD_ITEM_GROUP)));
            //TIER TIRO---------------------------------
                public static final RegistryObject<Item> TIER_TIRO_INGOT = ITEMS.register("tier_tiro_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> TIER_TIRO_GADGET = ITEMS.register("tier_tiro_gadget", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> TIER_TIRO_SCARF = ITEMS.register("tier_tiro_scarf", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    //OTHER WEAPONS----------------------------
            public static final RegistryObject<Item> EXT_STR = ITEMS.register("ext_str", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
            public static final RegistryObject<Item> EXT_RUT = ITEMS.register("ext_rut", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
            public static final RegistryObject<Item> FROST_SHARD = ITEMS.register("frost_shard", () -> new FrostShard(MasterTiers.iceSword, 16, 5.0F, FrostShard.properties.group(ModItemGroups.MOD_ITEM_GROUP)));
            public static final RegistryObject<Item> EXT_FRG = ITEMS.register("ext_frg", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
            public static final RegistryObject<Item> EXT_GEM = ITEMS.register("ext_gem", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
            public static final RegistryObject<Item> BREAKER_BLADE = ITEMS.register("breaker_blade", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
            public static final RegistryObject<Item> EXT_KAT = ITEMS.register("ext_kat", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
        //OTHER MATERIALS---------------------------
            public static final RegistryObject<Item> TURQUOISE_GEM = ITEMS.register("turquoise_gem", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
            public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
        //OTHER ITEMS-------------------------------
            public static final RegistryObject<Item> HELLO_INVENTORY = ITEMS.register("hello_inventory", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

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
     //   public static final RegistryObject<Item> WISTERIA_PLANKS = ITEMS.register("wisteria_planks", () -> new BlockItem(BlockRegister.WISTERIA_PLANKS.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
      //  public static final RegistryObject<Item> WISTERIA_LEAVES = ITEMS.register("wisteria_leaves", () -> new BlockItem(BlockRegister.WISTERIA_LEAVES.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
      //  public static final RegistryObject<Item> WISTERIA_LOG = ITEMS.register("wisteria_log", () -> new BlockItem(BlockRegister.WISTERIA_LOG.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    //public static final RegistryObject<Item> WISTERIA_SAPLING = ITEMS.register("wisteria_sapling", () -> new BlockItem(BlockRegister.WISTERIA_SAPLING.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
        public static final RegistryObject<Item> TURQUOISE_ORE = ITEMS.register("turquoise_ore", () -> new BlockItem(BlockRegister.TURQUOISE_ORE.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
        public static final RegistryObject<Item> SMALLSCREEN = ITEMS.register("smallscreen", () -> new BlockItem(BlockRegister.SMALLSCREEN.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
        public static final RegistryObject<Item> LEAF_PILE = ITEMS.register("leaf_pile", () -> new BlockItem(BlockRegister.LEAF_PILE.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
        public static final RegistryObject<Item> second_block = ITEMS.register("second_block", () -> new BlockItem(BlockRegister.SECOND_BLOCK.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
}
