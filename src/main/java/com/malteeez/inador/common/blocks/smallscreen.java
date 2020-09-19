package com.malteeez.inador.common.blocks;


import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class smallscreen extends Block {

        private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

        private static final VoxelShape SHAPE_N = Stream.of(
                Block.makeCuboidShape(5, 0, 5, 11, 3, 10),
                Block.makeCuboidShape(6, 3, 6, 10, 4, 9),
                Block.makeCuboidShape(4, 3, 7, 12, 9, 8)
        ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

        private static final VoxelShape SHAPE_E = Stream.of(
                Block.makeCuboidShape(6, 0, 5, 11, 3, 11),
                Block.makeCuboidShape(7, 3, 6, 10, 4, 10),
                Block.makeCuboidShape(8, 3, 4, 9, 9, 12)
        ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

        private static final VoxelShape SHAPE_S = Stream.of(
                Block.makeCuboidShape(5, 0, 5, 11, 3, 10),
                Block.makeCuboidShape(6, 3, 6, 10, 4, 9),
                Block.makeCuboidShape(4, 3, 7, 12, 9, 8)
        ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

        private static final VoxelShape SHAPE_W = Stream.of(
                Block.makeCuboidShape(5, 0, 5, 10, 3, 11),
                Block.makeCuboidShape(6, 3, 6, 9, 4, 10),
                Block.makeCuboidShape(7, 3, 4, 8, 9, 12)
        ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

        public smallscreen() {
            super(Block.Properties.create(Material.PISTON)
                    .hardnessAndResistance(3.5F, 4.0F)
                    .sound(SoundType.STONE)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE));
        }

        @Override
        public BlockState getStateForPlacement(BlockItemUseContext context) {
            return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
            switch (state.get(FACING)) {
                case NORTH:
                    return SHAPE_N;
                case SOUTH:
                    return SHAPE_S;
                case EAST:
                    return SHAPE_E;
                case WEST:
                    return SHAPE_W;
                default:
                    return SHAPE_N;
            }
        }

        @Override
        public BlockState rotate(BlockState state, Rotation rot) {
            return state.with(FACING, rot.rotate(state.get(FACING)));
        }

        @Override
        public BlockState mirror(BlockState state, Mirror mirrorIn) {
            return state.rotate(mirrorIn.toRotation(state.get(FACING)));
        }

        @Override
        protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
            builder.add(FACING);
        }

        /**Change the block shadow -- Lower return values = more shadow*/
        @Override
        public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
            return 0.6F;
        }
}
