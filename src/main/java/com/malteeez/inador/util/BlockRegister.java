package com.malteeez.inador.util;

import com.malteeez.inador.InAdor;
import com.malteeez.inador.common.blocks.*;
import com.malteeez.inador.common.blocks.SaplingBlock;
import com.malteeez.inador.world.gen.WisteriaTree;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
    public static final RegistryObject<Block> WISTERIA_LEAVES = BLOCKS.register("wisteria_leaves", () -> new Block(Block.Properties.from(Blocks.BIRCH_LEAVES)));
    public static final RegistryObject<Block> WISTERIA_LOG = BLOCKS.register("wisteria_log", () -> new Block(Block.Properties.from(Blocks.BIRCH_LOG)));
    public static final RegistryObject<Block> WISTERIA_SAPLING = BLOCKS.register("wisteria_sapling", () -> new SaplingBlock(() -> new WisteriaTree(), Block.Properties.from(Blocks.BIRCH_SAPLING)));
    public static final RegistryObject<Block> TURQUOISE_ORE = BLOCKS.register("turquoise_ore", TurquoiseOre::new);
    public static final RegistryObject<Block> SMALLSCREEN = BLOCKS.register("smallscreen", Smallscreen::new);
    public static final RegistryObject<Block> LEAF_PILE = BLOCKS.register("leaf_pile", () -> new Leafpile(Leafpile.PROPERTIES));
    public static final RegistryObject<Block> SECOND_BLOCK = BLOCKS.register("second_block", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F, 1.0F).harvestTool(ToolType.PICKAXE)));
}
