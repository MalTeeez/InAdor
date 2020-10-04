package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.common.items.tool.meleetype.FrostShard;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.Hand;
import net.minecraft.util.datafix.fixes.PotionItems;

import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = InAdor.MODID)
public class EventHandler {

    private static LivingEntity target;
    private static PlayerEntity player;

    /**
     * @see PotionItems
     * @see net.minecraft.potion.Effects
     */

    @SubscribeEvent
    public static void onHitEntity(LivingHurtEvent event) {

        target = event.getEntityLiving();
        Entity attacker = event.getSource().getTrueSource();
        /** YOU WILL HAVE A VERY SUCKY TIME IF YOU HAVE A PLAYERENTITY BOSS AND THIS MOD ( why would you?! ) **/

        if (attacker instanceof PlayerEntity) { // hacky bullshit
            player = (PlayerEntity) attacker;
            if (player != null) {
                Item handItem = player.getHeldItem(Hand.MAIN_HAND).getItem();

                /** <!--- "ability register" ---!> **/

                FrostShard.ability(player, target, handItem);
            }
        }
    }
}
