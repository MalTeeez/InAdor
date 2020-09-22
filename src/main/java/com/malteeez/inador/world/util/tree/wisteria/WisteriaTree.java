/*package com.malteeez.inador.world.util.tree.wisteria;

import com.malteeez.inador.util.BlockRegister;
import com.malteeez.inador.world.util.tree.TreeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.FancyTrunkPlacer;

import javax.annotation.Nullable;
import java.util.OptionalInt;
import java.util.Random;

public class WisteriaTree extends Tree {

    // thank you, quark :)
    public BaseTreeFeatureConfig WISTERIA_TREE_CONFIG;
    public BlockState wisteria_leaf;
    public WisteriaTreeSapling sapling;


    private static final Block[] blockItems = new Block[]{BlockRegister.WISTERIA_LOG.get(), BlockRegister.WISTERIA_LEAVES.get()};

    public WisteriaTree() {
        WISTERIA_TREE_CONFIG = (new TreeBuilder(
                new SimpleBlockStateProvider(blockItems[0].getDefaultState()),
                new SimpleBlockStateProvider(blockItems[1].getDefaultState()),
                new BlobFoliagePlacer(40, 1,150,5,5), new FancyTrunkPlacer(3, 11, 0),
                new TwoLayerFeature(0,0,0, OptionalInt.of(5)))).func_236700_a_().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();

                wisteria_leaf = blockItems[1].getDefaultState();
    }

    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
        return Feature.field_236291_c_.withConfiguration(WISTERIA_TREE_CONFIG);
    }


}
*/