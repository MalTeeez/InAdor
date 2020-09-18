package com.example.examplemod.common.items.tool;

import com.example.examplemod.common.items.tool.lib.SwordTool;
import net.minecraft.item.*;

public class ItemShiro extends SwordTool {

    public static SwordItem.Properties properties = setProperties(200, Rarity.EPIC);

    public ItemShiro(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
        getProperties();
        this.setRegistryName("Shiro");
    }

    private Properties getProperties(){
        return properties;
    }

    /* todo BELLA: finish constr versions and regis
        also, make sure it works, textures, etc
     */

   /**
    * deal with later!
    public ItemShiro(Properties properties) {
        super(properties);

    }
    */
/*
    public ItemShiro(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
        this.setRegistryName("Shiro");
    }

 */


}
