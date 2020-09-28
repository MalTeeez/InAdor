package com.malteeez.inador.common.blocks.special;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FrostedIceBlock;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class FrostShardBlock extends FrostedIceBlock {

    public FrostShardBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(7, 0, 4, 10, 1, 4.5),
            Block.makeCuboidShape(4, 0, 5.5, 11.5, 1, 12),
            Block.makeCuboidShape(5.5, 0, 4.5, 11, 1, 12.5),
            Block.makeCuboidShape(3.5, 0, 6.5, 4, 1, 11),
            Block.makeCuboidShape(11.5, 0, 8, 12, 1, 11),
            Block.makeCuboidShape(6.5, 0, 12.5, 8.5, 1, 13),
            Block.makeCuboidShape(4, 1, 4, 12, 32, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    // Overriding because I need to change block properties for this block. Is still essentially the same as a FrostedIceBlock
    @Override
    protected void turnIntoWater(BlockState p_196454_1_, World p_196454_2_, BlockPos p_196454_3_) {
        if (p_196454_2_.func_230315_m_().func_236040_e_()) {
            p_196454_2_.removeBlock(p_196454_3_, false);
        } else {
            p_196454_2_.setBlockState(p_196454_3_, Blocks.AIR.getDefaultState());
            p_196454_2_.neighborChanged(p_196454_3_, Blocks.AIR, p_196454_3_);
        }
    }

}
