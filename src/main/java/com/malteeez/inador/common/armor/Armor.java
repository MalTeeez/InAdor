package com.malteeez.inador.common.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;

public class Armor extends ArmorItem {

    /**
     * I like to use my own classes so I can modify them later on
     *
     */
    public static ArmorItem.Properties setProperties(int maxDmg, Rarity rarity, ItemGroup g, boolean noRepair) {
        ArmorItem.Properties p;
        if (noRepair) {
            p = new ArmorItem.Properties().setNoRepair().group(g).rarity(rarity).maxDamage(maxDmg);
        } else {
            p = new ArmorItem.Properties().group(g).rarity(rarity).maxDamage(maxDmg);
        }
        return p;
    }

    public Armor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties p_i48534_3_) {
        super(materialIn, slot, p_i48534_3_);
    }

}
