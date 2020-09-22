package com.malteeez.inador.world.gen;

import com.malteeez.inador.util.BlockRegister;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class WisteriaTree extends Tree {
    public static final BaseTreeFeatureConfig JAZZ_TREE_CONFIG = (new BaseTreeFeatureConfig(
            new SimpleBlockStateProvider(BlockRegister.WISTERIA_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(BlockRegister.WISTERIA_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(40, 1,150,5,5))
            .setSapling((IPlantable) BlockRegister.WISTERIA_SAPLING.get()).build();

    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.field_236291_c_.withConfiguration(JAZZ_TREE_CONFIG);
    }
}
