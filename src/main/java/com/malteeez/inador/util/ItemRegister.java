package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.common.armor.ArmorMaterials;
import com.malteeez.inador.common.armor.type.Cloth;
import com.malteeez.inador.common.items.tiers.MasterTiers;
import com.malteeez.inador.common.items.tool.meleetype.FrostShard;
import com.malteeez.inador.common.items.tool.meleetype.ItemShiro;
import com.malteeez.inador.common.items.tool.proj.BowNameToBeRefactored;
import com.malteeez.inador.init.ModItemGroups;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("all")
public class ItemRegister {

    private static String _MODID = InAdor.MODID;

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, _MODID);

    /** <!------ ITEMS ------!> **/


        /** tiered items **/

            // TIER KOZA ->
                public static final RegistryObject<Item> TIER_KOZA_INGOT = ITEMS.register("tier_koza_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> TIER_KOZA_GADGET = ITEMS.register("tier_koza_gadget", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<ArmorItem> TIER_KOZA_SCARF = ITEMS.register("tier_koza_scarf",
                     () -> new ArmorItem(ArmorMaterials.SCARF_1, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

            // TIER KURA ->
                public static final RegistryObject<Item> TIER_KURA_INGOT = ITEMS.register("tier_kura_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> TIER_KURA_GADGET = ITEMS.register("tier_kura_gadget", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

            // TIER SHIRO ->
                public static final RegistryObject<Item> TIER_SHIRO_INGOT = ITEMS.register("tier_shiro_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> TIER_SHIRO_GADGET = ITEMS.register("tier_shiro_gadget", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> SHIRO = ITEMS.register("shiro", () -> new ItemShiro(MasterTiers.shiro, 14, 4.0F, ItemShiro.properties.group(ModItemGroups.MOD_ITEM_GROUP)));
            // TIER TIRO ->
                public static final RegistryObject<Item> TIER_TIRO_INGOT = ITEMS.register("tier_tiro_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> TIER_TIRO_GADGET = ITEMS.register("tier_tiro_gadget", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> TIER_TIRO_SCARF = ITEMS.register("tier_tiro_scarf", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

        /** tiered items **/



        /** misc weapons **/

                public static final RegistryObject<Item> EXT_STR = ITEMS.register("ext_str", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> EXT_RUT = ITEMS.register("ext_rut", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> FROST_SHARD = ITEMS.register("frost_shard", () -> new FrostShard(MasterTiers.iceSword, 8, 5.0F, FrostShard.properties.group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> EXT_FRG = ITEMS.register("ext_frg", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> EXT_GEM = ITEMS.register("ext_gem", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> BREAKER_BLADE = ITEMS.register("breaker_blade", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> EXT_KAT = ITEMS.register("ext_kat", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

        /** misc weapons **/



        /** material items **/

                public static final RegistryObject<Item> TURQUOISE_GEM = ITEMS.register("turquoise_gem", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

        /** material items **/

        /** other items **/

                public static final RegistryObject<Item> HELLO_INVENTORY = ITEMS.register("hello_inventory", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

        /** other items **/



    /** <!------ ARMOR ITEMS ------!> **/


        /** cloth **/

                public static final RegistryObject<ArmorItem> CLOTH_HELMET = ITEMS.register("cloth_helmet",
                    () -> new Cloth.Helmet(ArmorMaterials.CLOTH, EquipmentSlotType.HEAD, Cloth.Helmet.properties.group(ModItemGroups.MOD_ITEM_GROUP)));

                public static final RegistryObject<ArmorItem> CLOTH_CHESTPLATE = ITEMS.register("cloth_chestplate",
                    () -> new Cloth.Chestplate(ArmorMaterials.CLOTH, EquipmentSlotType.CHEST, Cloth.Chestplate.properties.group(ModItemGroups.MOD_ITEM_GROUP)));

                public static final RegistryObject<ArmorItem> CLOTH_LEGGINGS = ITEMS.register("cloth_leggings",
                    () -> new Cloth.Leggings(ArmorMaterials.CLOTH, EquipmentSlotType.LEGS, Cloth.Leggings.properties.group(ModItemGroups.MOD_ITEM_GROUP)));

                public static final RegistryObject<ArmorItem> CLOTH_BOOTS = ITEMS.register("cloth_boots",
                    () -> new Cloth.Boots(ArmorMaterials.CLOTH, EquipmentSlotType.FEET, Cloth.Boots.properties.group(ModItemGroups.MOD_ITEM_GROUP)));

        /** cloth **/


    /** <!------ PROJECTILE ITEMS ------!> **/

                public static final RegistryObject<BowItem> FUCKING_BOW = ITEMS.register("fucking_bow_name", () -> new BowNameToBeRefactored(BowNameToBeRefactored.PROPERTIES));

    /** <!------ BLOCK ITEMS ------!> **/


        /** Wisteria Tree **/

                //public static final RegistryObject<Item> WISTERIA_PLANKS = ITEMS.register("wisteria_planks", () -> new BlockItem(BlockRegister.WISTERIA_PLANKS.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                //public static final RegistryObject<Item> WISTERIA_LEAVES = ITEMS.register("wisteria_leaves", () -> new BlockItem(BlockRegister.WISTERIA_LEAVES.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                //public static final RegistryObject<Item> WISTERIA_LOG = ITEMS.register("wisteria_log", () -> new BlockItem(BlockRegister.WISTERIA_LOG.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                //public static final RegistryObject<Item> WISTERIA_SAPLING = ITEMS.register("wisteria_sapling", () -> new BlockItem(BlockRegister.WISTERIA_SAPLING.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

        /** Wisteria Tree **/


        /** ores **/

                public static final RegistryObject<Item> TURQUOISE_ORE = ITEMS.register("turquoise_ore", () -> new BlockItem(BlockRegister.TURQUOISE_ORE.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

        /** ores **/


        /** misc **/

                public static final RegistryObject<Item> SMALLSCREEN = ITEMS.register("smallscreen", () -> new BlockItem(BlockRegister.SMALLSCREEN.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
                public static final RegistryObject<Item> second_block = ITEMS.register("second_block", () -> new BlockItem(BlockRegister.SECOND_BLOCK.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

        /** misc **/


        /** plant-like **/

                public static final RegistryObject<Item> LEAF_PILE = ITEMS.register("leaf_pile", () -> new BlockItem(BlockRegister.LEAF_PILE.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

        /** plant-like **/

}
