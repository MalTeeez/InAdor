package com.example.examplemod.common.items.tool.lib;

import com.example.examplemod.api.ISword;
import com.example.examplemod.init.ModItemGroups;
import net.minecraft.item.*;

public class SwordTool extends SwordItem implements ISword {

    private IItemTier tier;

    public static SwordItem.Properties setProperties(int maxDmg, Rarity rarity, ItemGroup g){
        SwordItem.Properties properties = new Item.Properties().maxDamage(maxDmg).rarity(rarity).group(g);
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
