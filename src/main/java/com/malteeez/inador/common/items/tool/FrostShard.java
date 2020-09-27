package com.malteeez.inador.common.items.tool;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.api.ability.IAbility;
import com.malteeez.inador.common.items.tool.lib.SwordTool;
import com.malteeez.inador.init.ModItemGroups;


import net.minecraft.item.*;

public class FrostShard extends SwordTool implements IAbility {




    public static SwordItem.Properties properties = setProperties(200, Rarity.EPIC, ModItemGroups.MOD_ITEM_GROUP);

    public FrostShard(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }


    @Override
    public boolean hasAbility() {
        return true;
    }


}
