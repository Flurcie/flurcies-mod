package flurcie.fevo.mixin;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Rarity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Items.class)
public abstract class FoodItemsMixin {

  @Redirect(method = "<clinit>",
          at = @At(value = "INVOKE",
                  target = "Lnet/minecraft/item/Items;register(Ljava/lang/String;Lnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/Item;"))
  private static Item modifyFoodItems(String id, Item.Settings settings) {
    if ("apple".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.APPLE)
              // .food(FoodComponents.APPLE, ConsumableComponents.APPLE)
              .maxCount(16));
    }
    if ("bread".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.BREAD)
              // .food(FoodComponents.BREAD, ConsumableComponents.BREAD)
              .maxCount(16));
    }
    if ("porkchop".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.PORKCHOP)
              // .food(FoodComponents.PORKCHOP, ConsumableComponents.PORKCHOP)
              .maxCount(16));
    }
    if ("cooked_porkchop".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.COOKED_PORKCHOP)
              // .food(FoodComponents.COOKED_PORKCHOP, ConsumableComponents.COOKED_PORKCHOP)
              .maxCount(16));
    }
    if ("golden_apple".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.GOLDEN_APPLE, ConsumableComponents.GOLDEN_APPLE)
              .maxCount(16));
    }
    if ("enchanted_golden_apple".equals(id)) {
      return Items.register(id, new Item.Settings()
              .rarity(Rarity.RARE)
              .food(FoodComponents.ENCHANTED_GOLDEN_APPLE, ConsumableComponents.ENCHANTED_GOLDEN_APPLE)
              .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
              .maxCount(16));
    }
    if ("mushroom_stew".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.MUSHROOM_STEW)
              // .food(FoodComponents.MUSHROOM_STEW, ConsumableComponents.MUSHROOM_STEW)
              .useRemainder(Items.BOWL)
              .maxCount(16));
    }
    if ("cod".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.COD)
              // .food(FoodComponents.COD, ConsumableComponents.COD)
              .maxCount(16));
    }
    if ("salmon".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.SALMON)
              // .food(FoodComponents.SALMON, ConsumableComponents.SALMON)
              .maxCount(16));
    }
    if ("tropical_fish".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.TROPICAL_FISH)
              // .food(FoodComponents.TROPICAL_FISH, ConsumableComponents.TROPICAL_FISH)
              .maxCount(16));
    }
    if ("pufferfish".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.PUFFERFISH, ConsumableComponents.PUFFERFISH)
              .maxCount(16));
    }
    if ("cooked_cod".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.COOKED_COD)
              // .food(FoodComponents.COOKED_COD, ConsumableComponents.COOKED_COD)
              .maxCount(16));
    }
    if ("cooked_salmon".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.COOKED_SALMON)
              // .food(FoodComponents.COOKED_SALMON, ConsumableComponents.COOKED_SALMON)
              .maxCount(16));
    }
    if ("cookie".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.COOKIE)
              // .food(FoodComponents.COOKIE, ConsumableComponents.COOKIE)
              .maxCount(16));
    }
    if ("melon_slice".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.MELON_SLICE)
              // .food(FoodComponents.MELON_SLICE, ConsumableComponents.MELON_SLICE)
              .maxCount(16));
    }
    if ("dried_kelp".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.DRIED_KELP, ConsumableComponents.DRIED_KELP)
              .maxCount(16));
    }
    if ("beef".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.BEEF)
              // .food(FoodComponents.BEEF, ConsumableComponents.BEEF)
              .maxCount(16));
    }
    if ("cooked_beef".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.COOKED_BEEF)
              // .food(FoodComponents.COOKED_BEEF, ConsumableComponents.COOKED_BEEF)
              .maxCount(16));
    }
    if ("chicken".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.CHICKEN, ConsumableComponents.RAW_CHICKEN)
              .maxCount(16));
    }
    if ("cooked_chicken".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.COOKED_CHICKEN)
              // .food(FoodComponents.COOKED_CHICKEN, ConsumableComponents.COOKED_CHICKEN)
              .maxCount(16));
    }
    if ("rotten_flesh".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.ROTTEN_FLESH, ConsumableComponents.ROTTEN_FLESH)
              .maxCount(16));
    }
    if ("spider_eye".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.SPIDER_EYE, ConsumableComponents.SPIDER_EYE)
              .maxCount(16));
    }
    if ("carrot".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.CARROT)
              // .food(FoodComponents.CARROT, ConsumableComponents.CARROT)
              .maxCount(16));
    }
    if ("potato".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.POTATO)
              // .food(FoodComponents.POTATO, ConsumableComponents.POTATO)
              .maxCount(16));
    }
    if ("baked_potato".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.BAKED_POTATO)
              // .food(FoodComponents.BAKED_POTATO, ConsumableComponents.BAKED_POTATO)
              .maxCount(16));
    }
    if ("poisonous_potato".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.POISONOUS_POTATO, ConsumableComponents.POISONOUS_POTATO)
              .maxCount(16));
    }
    if ("golden_carrot".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.GOLDEN_CARROT)
              // .food(FoodComponents.GOLDEN_CARROT, ConsumableComponents.GOLDEN_CARROT)
              .maxCount(16));
    }
    if ("pumpkin_pie".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.PUMPKIN_PIE)
              // .food(FoodComponents.PUMPKIN_PIE, ConsumableComponents.PUMPKIN_PIE)
              .maxCount(16));
    }
    if ("rabbit".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.RABBIT)
              // .food(FoodComponents.RABBIT, ConsumableComponents.RABBIT)
              .maxCount(16));
    }
    if ("cooked_rabbit".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.COOKED_RABBIT)
              // .food(FoodComponents.COOKED_RABBIT, ConsumableComponents.COOKED_RABBIT)
              .maxCount(16));
    }
    if ("rabbit_stew".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.RABBIT_STEW)
              // .food(FoodComponents.RABBIT_STEW, ConsumableComponents.RABBIT_STEW)
              .useRemainder(Items.BOWL)
              .maxCount(16));
    }
    if ("mutton".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.MUTTON)
              // .food(FoodComponents.MUTTON, ConsumableComponents.MUTTON)
              .maxCount(16));
    }
    if ("cooked_mutton".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.COOKED_MUTTON)
              // .food(FoodComponents.COOKED_MUTTON, ConsumableComponents.COOKED_MUTTON)
              .maxCount(16));
    }
    if ("chorus_fruit".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.CHORUS_FRUIT, ConsumableComponents.CHORUS_FRUIT)
              .useCooldown(1.0F)
              .maxCount(16));
    }
    if ("beetroot".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.BEETROOT)
              // .food(FoodComponents.BEETROOT, ConsumableComponents.BEETROOT)
              .maxCount(16));
    }
    if ("beetroot_soup".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.BEETROOT_SOUP)
              // .food(FoodComponents.BEETROOT_SOUP, ConsumableComponents.BEETROOT_SOUP)
              .useRemainder(Items.BOWL)
              .maxCount(16));
    }
    if ("sweet_berries".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.SWEET_BERRIES)
              // .food(FoodComponents.SWEET_BERRIES, ConsumableComponents.SWEET_BERRIES)
              .maxCount(64));
    }
    if ("glow_berries".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.GLOW_BERRIES)
              // .food(FoodComponents.GLOW_BERRIES, ConsumableComponents.GLOW_BERRIES)
              .maxCount(64));
    }
    if ("suspicious_stew".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.SUSPICIOUS_STEW)
              // .food(FoodComponents.SUSPICIOUS_STEW, ConsumableComponents.SUSPICIOUS_STEW)
              .component(DataComponentTypes.SUSPICIOUS_STEW_EFFECTS, SuspiciousStewEffectsComponent.DEFAULT)
              .useRemainder(Items.BOWL)
              .maxCount(16));
    }
    if ("milk_bucket".equals(id)) {
      return Items.register(id, new Item.Settings()
              .component(DataComponentTypes.CONSUMABLE, ConsumableComponents.MILK_BUCKET)
              .recipeRemainder(Items.BUCKET)
              .useRemainder(Items.BUCKET)
              .maxCount(1));
    }
    if ("ominous_bottle".equals(id)) {
      return Items.register(id, new Item.Settings()
              .rarity(Rarity.UNCOMMON)
              .component(DataComponentTypes.CONSUMABLE, ConsumableComponents.OMINOUS_BOTTLE)
              .component(DataComponentTypes.OMINOUS_BOTTLE_AMPLIFIER, new OminousBottleAmplifierComponent(0))
              .maxCount(4));
    }
    if ("honey_bottle".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(FoodComponents.HONEY_BOTTLE, ConsumableComponents.HONEY_BOTTLE)
              .recipeRemainder(Items.GLASS_BOTTLE)
              .useRemainder(Items.GLASS_BOTTLE)
              .maxCount(4));
    }
    return Items.register(id, settings);
  }
}