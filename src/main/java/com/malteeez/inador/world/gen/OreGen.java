package com.malteeez.inador.world.gen;


import com.ibm.icu.impl.duration.impl.DataRecord;
import com.malteeez.inador.InAdor;
import com.malteeez.inador.util.BlockRegister;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;


@Mod.EventBusSubscriber(modid = InAdor.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGen {


    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE","end_stone", new BlockMatcher(Blocks.END_STONE));

    //ORE GEN MASTER REGISTRY
    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome.getCategory() == Biome.Category.NETHER) { //NETHER GEN - LEAVING THIS FOR ENDGAME ORES

            } else if (biome.getCategory() == Biome.Category.THEEND) {  //END GEN - LEAVING THIS FOR ENDGAME ORES

            } else {
                genOre(biome, 13, 15, 5, 61, OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockRegister.TURQUOISE_ORE.get().getDefaultState(), 7 );
            }
        }
    }

    /**
     * @param biome //This should be self explanatory
     * @param count //rareness multiplier = 1 lowest
     * @param bottomOffset //Lowest possible generation y level
     * @param topOffset // Look at next value
     * @param max //Highest possible y level generation = this-topOffset (IDK WHY BUT INTERNET SAYS SO FUCKING WEIRD)
     * @param filler //Block to fill empty spaces, only change this when in other dimension
     * @param defaultBlockState //The Block to generate
     * @param size //max Vein size
     */

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
