package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.common.items.tool.FrostShard;

import com.malteeez.inador.common.items.tool.ItemShiro;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.datafix.fixes.PotionItems;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import static net.minecraft.potion.Effect.get;

import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = InAdor.MODID)
public class EventHandler {

    private static LivingEntity target;
    private static PlayerEntity player;

    /**
     * @see PotionItems
     * @see net.minecraft.potion.Effects
     */

    private static final EffectInstance slow_instance = new EffectInstance(get(2), 120, 5);

    private static Logger logger = LogManager.getLogger();

    @SubscribeEvent // spaghetti is my favorite meal!
    public static void onHitEntity(LivingHurtEvent event) {
        target = event.getEntityLiving();
        Entity attacker = event.getSource().getTrueSource();
        // guess this is now player specific, to avoid boss handling
        // if using other mods, hope their bosses are not PlayerEntities
        if (attacker instanceof PlayerEntity) { // hacky bullshit
            player = (PlayerEntity) attacker;
            // check that player is nonnull, originally for debugging but keeping it
            if (player != null) {
                Item handItem = player.getHeldItem(Hand.MAIN_HAND).getItem();
                if (handItem instanceof FrostShard) {
                    target.addPotionEffect(slow_instance);
                    logger.info("FROST_SHARD: applied " + slow_instance + " to attacked Entity (" + target.getUniqueID() + ").");

                    int rand = (int) (1 + Math.random() * 12);

                    if ((rand / 3) > 2) {
                        double x = target.getPosX();
                        double y = target.getPosY();
                        double z = target.getPosZ();

                        logger.info("FROST_SHARD: placing Ice block @ " + x + ", " + y + ", " + z + ".");
                        logger.info("FROST_SHARD: placing Ice block @ " + x + ", " + (y + 1) + ", " + z + ".");

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
                            Block.replaceBlock(Blocks.AIR.getDefaultState(), Blocks.ICE.getStateForPlacement(c), world, pos, 2);
                            Block.replaceBlock(Blocks.AIR.getDefaultState(), Blocks.ICE.getStateForPlacement(c2), world, pos2, 2);
                        } else {
                            // spawn only one
                            Block.replaceBlock(Blocks.AIR.getDefaultState(), Blocks.ICE.getStateForPlacement(c), world, pos, 2);
                        }
                    }
                } else if (handItem instanceof ItemShiro) {
                    int chance = (int) (Math.random() * 60);
                    if ((chance / 10) <= 4) {
                        double x = target.getPosX();
                        double y = target.getPosY();
                        double z = target.getPosZ();

                        World world = target.getEntityWorld();

                        LightningBoltEntity lightning = EntityType.LIGHTNING_BOLT.create(world);
                        lightning.func_233576_c_(new Vector3d(x, y, z));
                        lightning.setCaster((ServerPlayerEntity) player);

                        float health = player.getHealth();

                        player.addPotionEffect(new EffectInstance(get(11), 120, 20));
                        world.addEntity(lightning);

                        DamageSource src = player.getLastDamageSource();

                        if (src == DamageSource.LIGHTNING_BOLT || src == DamageSource.IN_FIRE || src == DamageSource.ON_FIRE) {
                            player.setHealth(health);
                        }
                    }
                }
            }
        }
    }

}
