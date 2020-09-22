package com.malteeez.inador.world.util;

import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.feature.AbstractFeatureSizeType;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;

public class TreeBuilder extends BaseTreeFeatureConfig.Builder {

    // a static base tree feature config
    public static BaseTreeFeatureConfig BTFCBUILD;

    // call this constructor to make a new instance, will automatically build and store that build
    // in the variable it's assigned to.
    // You must create an instance private to the class for ex (TreeGen) and call getBuild() statically
    // to return the build :P

    /**
     *
     * @param p_i232021_1_ - bsp (logs)
     * @param p_i232021_2_ - bsp (leaves)
     * @param p_i232021_3_ - foliage placer , places freaking blobs
     * @param p_i232021_4_ - abstract trunk
     * @param p_i232021_5_ - abstract feature
     */
    public TreeBuilder(BlockStateProvider p_i232021_1_, BlockStateProvider p_i232021_2_, FoliagePlacer p_i232021_3_, AbstractTrunkPlacer p_i232021_4_, AbstractFeatureSizeType p_i232021_5_) {
        super(p_i232021_1_, p_i232021_2_, p_i232021_3_, p_i232021_4_, p_i232021_5_);
        this.BTFCBUILD = build();
        getBuild();
    }

    public static BaseTreeFeatureConfig getBuild(){
        return BTFCBUILD;
    }
}
