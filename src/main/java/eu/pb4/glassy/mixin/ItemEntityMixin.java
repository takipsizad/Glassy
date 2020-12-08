package eu.pb4.glassy.mixin;

import eu.pb4.glassy.Glassy;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntity.class)
public abstract class ItemEntityMixin {
    @Shadow public abstract ItemStack getStack();
    @Shadow private int pickupDelay;

    @Inject(method = "onPlayerCollision", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getItem()Lnet/minecraft/item/Item;"))
    private void GlassShardDamage(PlayerEntity player, CallbackInfo ci) {
        if (!player.isSneaking() && getStack().getItem().isIn(Glassy.GLASS_SHARD_TAG) && this.pickupDelay == 0) player.damage(DamageSource.CACTUS, 2);
    }
}
