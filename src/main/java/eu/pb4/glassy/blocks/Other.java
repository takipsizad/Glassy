package eu.pb4.glassy.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class Other {
    public static boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    public static boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }


    public static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }
}
