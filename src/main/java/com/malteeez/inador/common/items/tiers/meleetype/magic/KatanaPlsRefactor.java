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
import net.minecraft.fluid.Fluids;
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

public class KatanaPlsRefactor extends SwordTool implements IAbility {

    private static final EffectInstance weakness_instance = new EffectInstance(get(18), 40, 2);
    private static final Logger logger = LogManager.getLogger();
    private static boolean spawnLava;

    public static final SwordTool.Properties properties = setProperties(14, Rarity.UNCOMMON, ModItemGroups.MOD_ITEM_GROUP);

    public KatanaPlsRefactor(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
        this.spawnLava = false; // this can be set when we have a gui! :D
    }

    @Override
    public boolean hasAbility() {
        return true;
    }

    @Ability(NAME ="Fire", CLASS = KatanaPlsRefactor.class)
    public void ability(PlayerEntity player, LivingEntity target, Item handItem) {
        if (handItem instanceof KatanaPlsRefactor) {
            target.addPotionEffect(weakness_instance);
            logger.info("KATANA: applied " + weakness_instance + " to attacked Entity (" + target.getUniqueID() + ").");

            target.setFire(10);
            if (spawnLava) {
                secretLavaAbility(target);
            }
        }
    }

    /**
     *
     * @param target - to be affected
     */

    private void secretLavaAbility(LivingEntity target) {
        // this should work.. in theory
        double x = target.getPosX();
        double y = target.getPosY();
        double z = target.getPosZ();

        logger.info("FROST_SHARD: placing " + Fluids.LAVA + " @ " + x + ", " + y + ", " + z + ".");
        logger.info("FROST_SHARD: placing " + Fluids.LAVA + " @ " + x + ", " + (y + 1) + ", " + z + ".");

        // world & block pos
        World world = target.getEntityWorld();
        BlockPos pos = new BlockPos(x, y - 1, z);
        BlockPos pos2 = new BlockPos(x + 1, y - 1, z);
        BlockPos pos3 = new BlockPos(x + 1, y - 1, z + 1);
        BlockPos pos4 = new BlockPos(x, y - 1, z + 1);

        Block.replaceBlock(target.getBlockState(), Fluids.LAVA.getDefaultState().getBlockState(), world, pos, 2);
        Block.replaceBlock(target.getBlockState(), Fluids.LAVA.getDefaultState().getBlockState(), world, pos2, 2);
        Block.replaceBlock(target.getBlockState(), Fluids.LAVA.getDefaultState().getBlockState(), world, pos3, 2);
        Block.replaceBlock(target.getBlockState(), Fluids.LAVA.getDefaultState().getBlockState(), world, pos4, 2);

    }
}
