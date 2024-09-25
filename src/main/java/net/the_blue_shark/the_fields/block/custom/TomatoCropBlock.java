package net.the_blue_shark.the_fields.block.custom;

import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.the_blue_shark.the_fields.item.ModItems;

public class TomatoCropBlock extends CropBlock {
    public static final int MAX_AGE = 9;
    public static final IntProperty AGE = IntProperty.of("age", 0, 9);

    private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[] {
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 16.0D, 16.0D),  // Age 0
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 16.0D, 16.0D),  // Age 1
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 16.0D, 16.0D),  // Age 2
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 16.0D, 16.0D),  // Age 3
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 16.0D, 16.0D), // Age 4
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 16.0D, 16.0D), // Age 5
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 16.0D, 16.0D), // Age 6
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 16.0D, 16.0D), // Age 7
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 16.5D, 16.0D), // Age 8
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 16.0D, 16.0D)  // Age 9
    };

    public TomatoCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[this.getAge(state)];
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.TOMATO_SEEDS;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    
}