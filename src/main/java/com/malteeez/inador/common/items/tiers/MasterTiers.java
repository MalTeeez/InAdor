package com.malteeez.inador.common.items.tiers;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.RegistryObject;

public class MasterTiers {

    /**
     * @see net.minecraft.item.ItemTier
     * @see net.minecraft.item.Items
     */

    // register ingredient itemstacks here! (if needed)
    /*
    ---Tier Names---
    kura
    zoki
    luri
    nosu
    fero
    hina
    koza
    shiro
    tiro
     */

    // item tiers!
    public static final IItemTier shiro = makeTier(100000, 2,14,4.0F, 3, 14, Ingredient.EMPTY);
    public static final IItemTier sora = makeTier(100000, 2,14,4.0F, 3, 14, Ingredient.EMPTY);

    // change as needed please
    public static final IItemTier iceSword = makeTier(1000000, 0, 8, 4.0F, 0, 14, Ingredient.EMPTY);
    public static final IItemTier katana = makeTier(20000, 2, 7, 16.0F, 3, 14, Ingredient.EMPTY);
    /**
     *
     * @param max - max uses
     * @param eff - efficiency speed
     * @param aD - attack damage
     * @param aS - float
     * @param harvest - harvest lvl
     * @param ench - enchantability
     * @param mat - repair material
     * @return - new iitemtier object
     *
     */

    private static IItemTier makeTier(int max, float eff, float aD, float aS, int harvest, int ench, Ingredient mat) {
        IItemTier tier = new IItemTier() {

            @Override
            public int getMaxUses() {
                return max;
            }

            @Override
            public float getEfficiency() {
                return eff;
            }

            @Override
            public float getAttackDamage() {
                return aD;
            }

            public float getAttackSpeed() {
                return aS;
            }

            @Override
            public int getHarvestLevel() {
                return harvest;
            }

            @Override
            public int getEnchantability() {
                return ench;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return mat;
            }

        };
        return tier;
    }


    private static Ingredient toIngredient(ItemStack stack) {
       Ingredient i = Ingredient.fromStacks(stack);
       return i;
    }

    private static Item getItemFrom(RegistryObject<Item> item) {
        Item t = item.get();
        return t;
    }
}
