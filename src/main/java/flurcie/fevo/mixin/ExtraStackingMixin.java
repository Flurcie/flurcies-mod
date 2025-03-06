package flurcie.fevo.mixin;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
//FoodItemsMixin isn't able to cover potions or charges, which we also want to change while we're at it.
@Mixin(Items.class)
public abstract class ExtraStackingMixin {

    @Redirect(method = "<clinit>",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/item/Items;register(Ljava/lang/String;Ljava/util/function/Function;Lnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/Item;",
                    remap = false))
    private static Item modifyExtraItems(String id, java.util.function.Function<Item.Settings, Item> factory, Item.Settings settings) {
        if ("fire_charge".equals(id)) {
            return Items.register(id, factory, settings.maxCount(16));
        }
        if ("wind_charge".equals(id)) {
            return Items.register(id, factory, settings.maxCount(16));
        }
        if ("potion".equals(id)) {
            return Items.register(id, factory, settings.maxCount(16));
        }
        if ("splash_potion".equals(id)) {
            return Items.register(id, factory, settings.maxCount(16));
        }
        if ("lingering_potion".equals(id)) {
            return Items.register(id, factory, settings.maxCount(16));
        }
        return Items.register(id, factory, settings);
    }
}