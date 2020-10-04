package com.malteeez.inador.client.gui;

import net.minecraft.client.gui.DisplayEffectsScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.PlayerContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public abstract class IAScreen extends DisplayEffectsScreen<PlayerContainer> {

    public static final ResourceLocation GUI_IMAGE = null; // todo please set
    public final PlayerEntity player;

    public IAScreen(PlayerEntity playerIn, ITextComponent titleIn) {
        super(playerIn.container, playerIn.inventory, titleIn);
        this.player = playerIn;
    }

}
