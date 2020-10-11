package com.malteeez.inador.common.items.tiers.meleetype.magic;

import com.malteeez.inador.api.ability.IAbility;
import com.malteeez.inador.api.anno.Ability;
import com.malteeez.inador.common.items.tool.lib.SwordTool;
import com.malteeez.inador.init.ModItemGroups;


import com.malteeez.inador.util.BlockRegister;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.minecraft.potion.Effect.get;

public class FrostShard extends SwordTool implements IAbility {


    private static final EffectInstance slow_instance = new EffectInstance(get(2), 120, 5);
    private static final Logger logger = LogManager.getLogger();


    public static SwordItem.Properties properties = setProperties(200, Rarity.EPIC, ModItemGroups.MOD_ITEM_GROUP);

    public FrostShard(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }


    @Override
    public boolean hasAbility() {
        return true;
    }

    @Ability(NAME = "Freeze", CLASS = FrostShard.class)
    public static void ability(PlayerEntity player, LivingEntity target, Item handItem) {
        if (handItem instanceof FrostShard) {
            target.addPotionEffect(slow_instance);
            logger.info("FROST_SHARD: applied " + slow_instance + " to attacked Entity (" + target.getUniqueID() + ").");

            int rand = (int) (1 + Math.random() * 12);

            if ((rand / 3) > 2) {
                double x = target.getPosX();
                double y = target.getPosY();
                double z = target.getPosZ();

                logger.info("FROST_SHARD: placing " + BlockRegister.FROST_SHARD_BLOCK + " @ " + x + ", " + y + ", " + z + ".");
                logger.info("FROST_SHARD: placing " + BlockRegister.FROST_SHARD_BLOCK_2 + " @ " + x + ", " + (y + 1) + ", " + z + ".");

                // world & block pos
                World world = target.getEntityWorld();
                BlockPos pos = new BlockPos(x, y, z);
                BlockPos pos2 = new BlockPos(x, y + 1, z);

                // stuff for block states
                Vector3d vec = new Vector3d(x, y, z);
                Vector3d vec2 = new Vector3d(x, y + 1, z);

                BlockRayTraceResult b = new BlockRayTraceResult(vec, Direction.UP, pos, true);
                BlockRayTraceResult b2 = new BlockRayTraceResult(vec2, Direction.UP, pos2, true);
                BlockItemUseContext c = new BlockItemUseContext(new ItemUseContext(player, Hand.MAIN_HAND, b));
                BlockItemUseContext c2 = new BlockItemUseContext(new ItemUseContext(player, Hand.MAIN_HAND, b2));

                if (target.getHeight() >= 1) {
                    // spawn both blocks
                    Block.replaceBlock(Blocks.AIR.getDefaultState(), BlockRegister.FROST_SHARD_BLOCK_2.get().getStateForPlacement(c), world, pos, 2);
                    Block.replaceBlock(Blocks.AIR.getDefaultState(), BlockRegister.FROST_SHARD_BLOCK.get().getStateForPlacement(c2), world, pos2, 2);
                } else {
                    // spawn only one
                    Block.replaceBlock(Blocks.AIR.getDefaultState(), BlockRegister.FROST_SHARD_BLOCK.get().getStateForPlacement(c), world, pos, 2);
                }
            }
        }
    }
}
