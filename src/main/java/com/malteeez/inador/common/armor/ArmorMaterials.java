package com.malteeez.inador.common.armor;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.util.ItemRegister;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum ArmorMaterials implements IArmorMaterial {

    //ARMOR MATERIAL MASTER REGISTER
    CLOTH(InAdor.MODID + ":cloth", 13, new int[] { 1, 2, 3, 1 }, 9,
    SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0, () -> { return Ingredient.fromItems(ItemRegister.CLOTH.get()); },0);

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13 }; //[Helmet,Chestplate,Leggings,Boots] this*maxDamageFactor = Durability - Base values here are vanilla so seem ok
    private final String name;
    private final int maxDamageFactor; //Durability Scale factor, Iron=15, Diamond=33, Gold=7, Leather=5
    private final int[] damageReductionAmountArray; //Armor Bar Protection, 1 = 1/2 armor bar - [Helmet,Leggings,Chestplate,Boots]
    private final int enchantability; //Diamond=10, Gold=22
    private final SoundEvent soundEvent;
    private final float toughness; //Protection value multiplier + high damage reduction, 0.0F=Iron/Gold/Leather, 2.0F=Diamond, 3.0F=Netherite
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance; //1.0F=No Knockback, 0.0F=Disabled

    ArmorMaterials(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
                     SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return 0;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return null;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float func_230304_f_() {
        return 0;
    }
}
