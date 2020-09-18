package com.example.examplemod.common.items.tiers;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class TierShiro {

    public static IItemTier shiro = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 100000;
        }

        @Override
        public float getEfficiency() {
            return 0;
        }

        @Override
        public float getAttackDamage() {
            return 120;
        }

        public float getAttackSpeed() {
            return 9;
        }

        @Override
        public int getHarvestLevel() {
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 0;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return null;
            // todo energy
        }
    };
}
