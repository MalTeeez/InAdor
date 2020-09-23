package com.malteeez.inador.common.capabilities.type;

import com.malteeez.inador.api.ability.IIceAbility;
import com.malteeez.inador.common.capabilities.Ability;
import com.malteeez.inador.common.items.tool.FrostShard;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.datafix.fixes.PotionItems;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static net.minecraft.potion.Effect.*;


public class IceAbility extends Ability implements IIceAbility {

    FrostShard sword;

    LivingEntity player;
    LivingEntity target;

    Potion slowness = Potion.getPotionTypeForName("slowness");

    /**
     * @see PotionItems
     */

    EffectInstance slow_instance = new EffectInstance(get(26), 120, 5);

    public IceAbility() {
        super();
    }

    @Override
    public float set(float id) {
        return 0;
    }

    @Override
    public LivingEntity getTarget() {
        return this.target;
    }

    public LivingEntity getAttackedEntity(LivingEntity e) {
        target = (LivingEntity) e.getLastAttackedEntity().getEntity();
        return target;
    }

    public void onHitEntity(LivingEntity e) {
        e = this.target;
        target.addPotionEffect(slow_instance);
        // x y z
        double x = target.lastTickPosX;
        double y = target.lastTickPosY;
        double z = target.lastTickPosZ;
        // world & block pos
        World world = target.getEntityWorld();
        BlockPos pos = new BlockPos(x,y,z);
        // spawn block
        Block.spawnAsEntity(world, pos, new ItemStack(Blocks.ICE.asItem()));
    }

}
