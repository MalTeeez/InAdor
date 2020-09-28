package com.malteeez.inador.common.armor.type;

import com.malteeez.inador.common.armor.Armor;
import com.malteeez.inador.init.ModItemGroups;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Rarity;

public class Cloth {

    /**
     * being that the input Properties should be the same as the class specific properties,
     * there should be no error when changing it!
     *
     * this class holds all armors for cloth, making it someone organized, and once again,
     * easily modifiable.
     */

    public static class Helmet extends Armor {

        public static ArmorItem.Properties properties = setProperties(1,Rarity.COMMON, ModItemGroups.MOD_ITEM_GROUP, false);

        public Helmet(IArmorMaterial materialIn, EquipmentSlotType slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
            this.properties = p_i48534_3_;
        }
    }

    public static class Chestplate extends Armor {

        public static ArmorItem.Properties properties = setProperties(3,Rarity.COMMON, ModItemGroups.MOD_ITEM_GROUP, false);

        public Chestplate(IArmorMaterial materialIn, EquipmentSlotType slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
            this.properties = p_i48534_3_;
        }
    }

    public static class Leggings extends Armor {

        public static ArmorItem.Properties properties = setProperties(2,Rarity.COMMON,  ModItemGroups.MOD_ITEM_GROUP, false);

        public Leggings(IArmorMaterial materialIn, EquipmentSlotType slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
            this.properties = p_i48534_3_;
        }
    }

    public static class Boots extends Armor {

        public static ArmorItem.Properties properties = setProperties(1, Rarity.COMMON,  ModItemGroups.MOD_ITEM_GROUP, false);

        public Boots(IArmorMaterial materialIn, EquipmentSlotType slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
            this.properties = p_i48534_3_;
        }
    }
}
