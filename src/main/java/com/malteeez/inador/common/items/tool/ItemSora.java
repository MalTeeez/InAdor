package com.malteeez.inador.common.items.tool;

import com.malteeez.inador.api.ISword;
import com.malteeez.inador.common.items.tool.lib.SwordTool;
import net.minecraft.item.IItemTier;

public class ItemSora extends SwordTool implements ISword {

    public ItemSora(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }
}
