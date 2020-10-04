package com.malteeez.inador.common.items.tool.proj;

import com.malteeez.inador.init.ModItemGroups;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;

import java.util.function.Predicate;

public class BowNameToBeRefactored extends BowItem {

    public static final Properties PROPERTIES = genProperties();

    public BowNameToBeRefactored(Properties builder) {
        super(builder);
    }

    @Override
    public Predicate<ItemStack> getInventoryAmmoPredicate() {
        return ARROWS;
    }

    @Override
    public AbstractArrowEntity customArrow(AbstractArrowEntity arrow) {
        return arrow;
    }

    private static Properties genProperties() {
        Properties p = new Properties();
        p.group(ModItemGroups.MOD_ITEM_GROUP);
        p.rarity(Rarity.UNCOMMON);
        return p;
    }
}
