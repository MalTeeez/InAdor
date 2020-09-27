package com.malteeez.inador.common.items.tool;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.api.ability.IAbility;
import com.malteeez.inador.common.items.tool.lib.SwordTool;
import com.malteeez.inador.init.ModItemGroups;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.datafix.fixes.PotionItems;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static net.minecraft.potion.Effect.get;

@Mod.EventBusSubscriber(modid = InAdor.MODID)
public class FrostShard extends SwordTool implements IAbility {

    private static LivingEntity target;
    private static PlayerEntity player;

    /**
     * @see PotionItems
     * @see net.minecraft.potion.Effects
     */

    private static EffectInstance slow_instance = new EffectInstance(get(2), 120, 5);

    private static Logger logger = LogManager.getLogger();


    public static SwordItem.Properties properties = setProperties(200, Rarity.EPIC, ModItemGroups.MOD_ITEM_GROUP);

    public FrostShard(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }


    @Override
    public boolean hasAbility() {
        return true;
    }

    @SubscribeEvent // spaghetti is my favorite meal!
    public static void onHitEntity(LivingHurtEvent event) {
        // get entities involved
        target = event.getEntityLiving();
        Entity attacker = event.getSource().getTrueSource();
        // guess this is now player specific, to avoid boss handling
        // if using other mods, hope their bosses are not PlayerEntities
        if (!(attacker instanceof PlayerEntity)) { // hacky bullshit
            // sorry for console spam!
            logger.debug("entity " + target.getUniqueID() + " damaged @ " + target.getPosX() + ", " + target.getPosY() + "," + target.getPosX() + ".");
        } else {
            player = (PlayerEntity) attacker;
            // check that player is nonnull, originally for debugging but keeping it
            if (player != null) {
                Item handItem = player.getHeldItem(Hand.MAIN_HAND).getItem();
                if (handItem instanceof FrostShard) {
                    target.addPotionEffect(slow_instance);
                    logger.info("FROST_SHARD: applied " + slow_instance + " to attacked Entity (" + target.getUniqueID() + ").");
                    // to make it kinda rare
                    int rand = (int) (1 + Math.random() * 12);

                    // maths
                    if ((rand / 3) > 2) {
                        // x y z
                        double x = target.lastTickPosX;
                        double y = target.lastTickPosY;
                        double z = target.lastTickPosZ;
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
                }
            }
        }
    }

    private static Item fromRegister(RegistryObject<Item> item) {
        return item.get();
    }

}
