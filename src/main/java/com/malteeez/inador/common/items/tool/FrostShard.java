package com.malteeez.inador.common.items.tool;

import com.malteeez.inador.api.IAbility;
import com.malteeez.inador.common.capabilities.Ability;
import com.malteeez.inador.common.items.tool.lib.SwordTool;

import com.malteeez.inador.init.ModItemGroups;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Rarity;

public class FrostShard extends SwordTool implements IAbility {

    public static SwordTool.Properties properties = setProperties(200, Rarity.EPIC, ModItemGroups.MOD_ITEM_GROUP);

    public FrostShard(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }

    @Override
    public boolean hasAbility() {
        return true;
    }

    public static Ability getAbility() {
        return Ability.ICE;
    }
}
