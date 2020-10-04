package com.malteeez.inador.client.gui;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

public class IAInventoryTab extends IAScreen {

    public final NonNullList<ItemStack> slotRow1 = NonNullList.withSize(4, ItemStack.EMPTY);

    public final PlayerEntity player;
    private Minecraft minecraft;

    protected FontRenderer renderer;
    protected ResourceLocation tab_background;

    public IAInventoryTab(PlayerEntity playerIn) {
        super(playerIn, new TranslationTextComponent(""));
        this.player = playerIn;

    }

    @Override
    protected void func_230450_a_(MatrixStack p_230450_1_, float p_230450_2_, int p_230450_3_, int p_230450_4_) {
        this.renderer.func_238421_b_(p_230450_1_, "random_fucking_string ",p_230450_2_, p_230450_3_, p_230450_4_); // todo what?
        this.minecraft.getTextureManager().bindTexture(tab_background);
    }

}


