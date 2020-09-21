package com.malteeez.inador.init;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.util.ItemRegister;
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
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(InAdor.MODID, () -> new ItemStack(ItemRegister.HELLO_INVENTORY.get()));

}
