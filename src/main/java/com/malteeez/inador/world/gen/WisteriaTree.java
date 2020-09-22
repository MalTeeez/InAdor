package com.malteeez.inador.world.gen;

import com.malteeez.inador.util.BlockRegister;
import com.malteeez.inador.world.util.TreeBuilder;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

public class WisteriaTree extends Tree {


    // create new instance of TreeBuilder
    // input args in the constructor below
    private static TreeBuilder builder = new TreeBuilder(new SimpleBlockStateProvider(BlockRegister.WISTERIA_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(BlockRegister.WISTERIA_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(40, 1,150,5,5), /*trunk placer*/,
            /*abstract feature size type*/);

    // in theory...
    public static final BaseTreeFeatureConfig JAZZ_TREE_CONFIG = builder.BTFCBUILD;

            /*new BaseTreeFeatureConfig(
            new SimpleBlockStateProvider(BlockRegister.WISTERIA_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(BlockRegister.WISTERIA_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(40, 1,150,5,5))
            .setSapling((IPlantable) BlockRegister.WISTERIA_SAPLING.get()).build());*/

    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.field_236291_c_.withConfiguration(JAZZ_TREE_CONFIG);
    }
}
