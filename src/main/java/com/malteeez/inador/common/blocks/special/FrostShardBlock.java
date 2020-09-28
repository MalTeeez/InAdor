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

    private static final VoxelShape SHAPE =
            Block.makeCuboidShape(4, 0, 4.5, 12.5, 15.5, 12.5);

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
