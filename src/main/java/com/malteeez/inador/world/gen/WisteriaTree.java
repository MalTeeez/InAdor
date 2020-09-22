package com.malteeez.inador.world.gen;

import com.malteeez.inador.util.BlockRegister;
import com.malteeez.inador.world.util.TreeBuilder;
import com.mojang.datafixers.util.Function3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;
import net.minecraftforge.common.IPlantable;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class WisteriaTree extends Tree {

    // create new instance of TreeBuilder
    // input args in the constructor below
    private static TreeBuilder builder = new TreeBuilder(new SimpleBlockStateProvider(BlockRegister.WISTERIA_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(BlockRegister.WISTERIA_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(40, 1,150,5,5),/*Abstract Trunk Placer kill me plz*/,
            1);

    // in theory...
    public static final BaseTreeFeatureConfig WISTERIA_TREE_CONFIG = builder.BTFCBUILD;

    public static AbstractTrunkPlacer fuckme = new AbstractTrunkPlacer() {
        @Override
        protected TrunkPlacerType<?> func_230381_a_() {
            return TrunkPlacerType.field_236920_a_;
        }
    }

    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.field_236291_c_.withConfiguration(WISTERIA_TREE_CONFIG);
    }
}
