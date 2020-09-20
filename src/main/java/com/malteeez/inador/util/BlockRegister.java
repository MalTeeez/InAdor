package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.common.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegister {
    private static String _MODID = InAdor.MODID;

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, _MODID);

    //BLOCK MASTER REGISTRY
    public static final RegistryObject<Block> SMALLSCREEN = BLOCKS.register("smallscreen", smallscreen::new);
    public static final RegistryObject<Block> LEAF_PILE = BLOCKS.register("leaf_pile", () -> new Block(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).harvestLevel(0)));
    public static final RegistryObject<Block> HELLO_BLOCKS = BLOCKS.register("hello_blocks", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SECOND_BLOCK = BLOCKS.register("second_block", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F, 1.0F).harvestTool(ToolType.PICKAXE)));
}
