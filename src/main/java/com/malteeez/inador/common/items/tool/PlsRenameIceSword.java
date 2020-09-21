package com.malteeez.inador.common.items.tool;

import com.malteeez.inador.api.IAbility;
import com.malteeez.inador.common.data.Ability;
import com.malteeez.inador.common.items.tool.lib.SwordTool;

import net.minecraft.item.IItemTier;

public class PlsRenameIceSword extends SwordTool implements IAbility {

    protected static Ability ice = new Ability(0);

    public PlsRenameIceSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }

    @Override
    public Ability hasAbility() {
        return ice;
    }

    // for public access
    public static Ability getAbility() {
        return ice;
    }
}
