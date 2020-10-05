package com.malteeez.inador.common.items.tiers.projectile.kura;

import com.malteeez.inador.common.entity.TierKuraArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TierKuraArrowItem extends ArrowItem {

    public TierKuraArrowItem(Properties builder) {
        super(builder);
    }

    @Override
    public TierKuraArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
        TierKuraArrowEntity arrowentity = new TierKuraArrowEntity(worldIn, shooter);
        arrowentity.setPotionEffect(stack);
        return arrowentity;
    }
}
