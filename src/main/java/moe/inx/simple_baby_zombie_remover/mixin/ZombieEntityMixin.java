package moe.inx.simple_baby_zombie_remover.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.mob.ZombieEntity;

@Mixin(ZombieEntity.class)
public abstract class ZombieEntityMixin {
	@Inject(method = "method_29936", at = @At(value = "RETURN"), cancellable = true, remap = false)
	private static void simple_baby_zombie_remover$shouldBeBaby(CallbackInfoReturnable<Boolean> ci) {
		ci.setReturnValue(false);
	}
}
