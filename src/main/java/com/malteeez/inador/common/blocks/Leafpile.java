package com.malteeez.inador.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class Leafpile extends Block{

    public static Block.Properties PROPERTIES = Block.Properties.create(Material.LEAVES)
            .hardnessAndResistance(1.5F, 1.0F)
            .sound(SoundType.PLANT)
            .harvestLevel(1)
            .harvestTool(ToolType.HOE);

    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(1, 1, 2, 2, 11, 15),
            Block.makeCuboidShape(14, 1, 1, 15, 11, 15),
            Block.makeCuboidShape(2, 1, 14, 14, 11, 15),
            Block.makeCuboidShape(1, 1, 1, 14, 11, 2),
            Block.makeCuboidShape(2, 11, 2, 14, 12, 14),
            Block.makeCuboidShape(1, 0, 1, 15, 1, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public Leafpile(Properties properties) {
        super(PROPERTIES);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
    }

    /**Change the block shadow -- Lower return values = more shadow*/
    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.6F;
    }
}
