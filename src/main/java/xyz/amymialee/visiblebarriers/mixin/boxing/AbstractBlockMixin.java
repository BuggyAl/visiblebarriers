package xyz.amymialee.visiblebarriers.mixin.boxing;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractBlock.class)
public abstract class AbstractBlockMixin {
    @Shadow
    public abstract Item asItem();

    @Inject(method = "isTransparent", at = @At("HEAD"), cancellable = true)
    public void visibleBarriers$isTranslucent(BlockState state, CallbackInfoReturnable<Boolean> cir) {
    }

    @Inject(method = "isSideInvisible", at = @At("HEAD"), cancellable = true)
    public void visibleBarriers$isSideInvisible(BlockState state, BlockState stateFrom, Direction direction, CallbackInfoReturnable<Boolean> cir) {
    }

    @Inject(method = "getCollisionShape", at = @At("HEAD"), cancellable = true)
    public void visibleBarriers$getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context, CallbackInfoReturnable<VoxelShape> cir) {
    }
}