package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.util.ItemRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModItemGroups {

    public static class ModItemGroup extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

        public static Item getItemFrom(RegistryObject<Item> item) {
            Item iconItem = item.get();
            return iconItem;
        }
    }
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(ExampleMod.MODID, () -> new ItemStack(ModItemGroup.getItemFrom(ItemRegister.HELLO_INVENTORY)));

}
