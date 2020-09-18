package com.example.examplemod.util;

import com.example.examplemod.common.items.tool.ItemShiro;
import com.example.examplemod.common.items.tool.lib.SwordTool;

import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.registries.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;


public class Register {
    private static ItemShiro ItemShiro;
    // this is definitely wrong but this is the idea that im getting
    public Register() {
    }

    // items
    public static final RegistryObject<Item> Shiro =  Registry._ITEMS.register("Shiro", () -> SwordTool.newSword(ItemShiro));

   @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> regItem) {
       // regItem.getRegistry().register(ItemShiro);
       // should hopefully get Registry._ITEMS
       // how to implement with regisobj
   }
}