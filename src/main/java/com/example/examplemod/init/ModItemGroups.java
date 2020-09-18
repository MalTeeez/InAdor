package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

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

    }

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(ExampleMod.MOD_ID, () -> new ItemStack(ModItems.HELLO_INVENTORY));

}
