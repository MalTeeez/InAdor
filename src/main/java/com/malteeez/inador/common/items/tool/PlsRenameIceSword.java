package com.malteeez.inador.common.items.tool;

import com.malteeez.inador.api.IAbility;
import com.malteeez.inador.common.data.Ability;
import com.malteeez.inador.common.items.tool.lib.SwordTool;

import net.minecraft.item.IItemTier;

public class PlsRenameIceSword extends SwordTool implements IAbility {

    public PlsRenameIceSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }

   @Override
    public Ability hasAbility() {
        // just so that errors dont annoy me
        return new Ability();
    }
}
