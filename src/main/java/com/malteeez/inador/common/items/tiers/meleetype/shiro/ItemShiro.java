package com.malteeez.inador.common.items.tiers.meleetype.shiro;

import com.malteeez.inador.common.items.tool.lib.SwordTool;
import com.malteeez.inador.init.ModItemGroups;

import net.minecraft.item.*;

public class ItemShiro extends SwordTool {

    public static SwordItem.Properties properties = setProperties(200, Rarity.EPIC, ModItemGroups.MOD_ITEM_GROUP);

    public ItemShiro(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
        getProperties();
        this.canRepair(true);
    }

    private void canRepair(boolean b) {
    }

    // particle on swing?
    private static SwordItem.Properties getProperties(){
        return properties;
    }

}
