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


    public static void registerItemBlocks(final IForgeRegistry<Item> r) {
        for (final Block block : ModBlocks.ItemBlockBlocks) {// also some kind of hybrid I should stop getting code from decompiled jars sorry love
            r.register((IForgeRegistryEntry)new BBItemBlock(block, baseProperties())); //this need a few other functions and a helper class seems like a dumb idea
        }
    }

    public static void registerItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> r = (IForgeRegistry<Item>)event.getRegistry(); // Technically this could have a list of registers running from the func before it with r. - but im too dumb : maybe this helps https://prnt.sc/ujrdz2
        registerItemBlocks(r);

    /*
         todo
          this is most likely the registry class
            which will register blocks / items / etc
              unless more are needed, a possible RegistryUtil
                feel free to refactor every file i put in here, these are
                  only for informational purposes
                   https://mcforge.readthedocs.io/en/latest/concepts/registries/#registries
     */
         /*
   @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> regItem) {
        // regItem.getRegistry().register(ItemShiro);
        // should hopefully get Registry._ITEMS
        // how to implement with regisobj
    }

 */


}
