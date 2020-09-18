package com.example.examplemod.common.items.tool.lib;

import com.example.examplemod.api.ISword;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;

public class SwordTool extends SwordItem implements ISword {

    private IItemTier tier;

    public static SwordItem.Properties setProperties(int maxDmg, Rarity rarity){
        SwordItem.Properties properties = new Item.Properties().maxDamage(maxDmg).rarity(rarity).maxStackSize(1);
        return properties;
    }

    public static SwordTool newSword(SwordTool item) {
        return item;
    }

    public SwordTool(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }

    public IItemTier getTier() {
        return tier;
    }


}
