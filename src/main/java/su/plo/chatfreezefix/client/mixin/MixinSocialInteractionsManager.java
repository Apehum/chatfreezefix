package su.plo.chatfreezefix.client.mixin;

import net.minecraft.client.network.SocialInteractionsManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.UUID;

@Mixin(SocialInteractionsManager.class)
public class MixinSocialInteractionsManager {
    @Inject(method = "isPlayerBlocked", at = @At("HEAD"), cancellable = true)
    public void isPlayerBlocked(UUID uuid, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
