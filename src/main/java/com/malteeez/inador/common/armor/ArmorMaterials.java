package com.malteeez.inador.common.armor;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.util.ItemRegister;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ArmorMaterials implements IArmorMaterial {

    //ARMOR MATERIAL MASTER REGISTER
    CLOTH(InAdor.MODID + ":cloth", 11, new int[] { 1, 2, 3, 1 }, 9,
    SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0, () -> { return Ingredient.fromItems(ItemRegister.CLOTH.get()); },0);

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 13, 15, 16, 11 }; //[Boots, Leggings, Chestplate, Helmet] this*maxDamageFactor = Durability - Base values here are vanilla so seem ok
    private final String name;
    private final int maxDamageFactor; //Durability Scale factor, Iron=15, Diamond=33, Gold=7, Leather=5
    private final int[] damageReductionAmount; //Armor Bar Protection, 1 = 1/2 armor bar - [Helmet,Leggings,Chestplate,Boots]
    private final int enchantability; //Diamond=10, Gold=22
    private final SoundEvent soundEvent;
    private final float toughness; //Protection value multiplier + high damage reduction, 0.0F=Iron/Gold/Leather, 2.0F=Diamond, 3.0F=Netherite
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance; //1.0F=No Knockback, 0.0F=Disabled

    ArmorMaterials(String name, int maxDamageFactor, int[] damageReductionAmount, int enchantability,
                     SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmount = damageReductionAmount;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()]*this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmount[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
        return 0;
    }
}
