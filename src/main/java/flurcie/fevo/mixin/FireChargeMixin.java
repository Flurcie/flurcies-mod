package flurcie.fevo.mixin;

import net.minecraft.item.FireChargeItem;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//The fire charge is a total and absolute mess, so it needs its own mixin to be changed.
@Mixin(FireChargeItem.class)
public class FireChargeMixin {

    @ModifyArg(
            method = "<init>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V"
            ),
            index = 0
    )
    private static Item.Settings modifySettings(Item.Settings originalSettings) {
        return originalSettings.maxCount(16);
    }}