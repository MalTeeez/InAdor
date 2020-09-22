package com.malteeez.inador.world.util;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.feature.AbstractFeatureSizeType;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;

import java.util.List;

public class TreeGen extends BaseTreeFeatureConfig {
    public TreeGen(BlockStateProvider p_i232020_1_, BlockStateProvider p_i232020_2_, FoliagePlacer p_i232020_3_, AbstractTrunkPlacer p_i232020_4_, AbstractFeatureSizeType p_i232020_5_, List<TreeDecorator> p_i232020_6_, int p_i232020_7_, boolean p_i232020_8_, Heightmap.Type p_i232020_9_) {
        super(p_i232020_1_, p_i232020_2_, p_i232020_3_, p_i232020_4_, p_i232020_5_, p_i232020_6_, p_i232020_7_, p_i232020_8_, p_i232020_9_);
    }
}
