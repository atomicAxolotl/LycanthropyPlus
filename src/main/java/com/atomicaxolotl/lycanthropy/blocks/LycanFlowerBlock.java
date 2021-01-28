package com.atomicaxolotl.lycanthropy.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

//TODO get a render thing for this fella to fix the blacked out texture
public class LycanFlowerBlock extends BushBlock {
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    public LycanFlowerBlock() {
        super(Properties
                .create(Material.PLANTS)
                .notSolid()
                .doesNotBlockMovement()
                .tickRandomly()
                .sound(SoundType.PLANT)
                .setLightLevel(value -> 5)
                .variableOpacity()

        );
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;

    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL || block == Blocks.FARMLAND || state.getMaterial() == Material.SAND;

    }

    protected boolean canSustainBush(BlockState state) {
        return true;
    }


}