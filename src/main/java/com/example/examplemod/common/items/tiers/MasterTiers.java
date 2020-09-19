package com.example.examplemod.common.items.tiers;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class MasterTiers {
    // TODO revamp this tier class
    /**
     * @see net.minecraft.item.ItemTier
     * @see net.minecraft.item.Items
     */

    public static IItemTier shiro = makeTier(100000, 2,30,9.0F, 3, 14, null);
    public static IItemTier sora = makeTier(100000, 2,30,9.0F, 3, 14, null);

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
}
