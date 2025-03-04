package flurcie.fevo.item;

import flurcie.fevo.Fevo;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item SOURBERRY=registerItem("sourberry",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Fevo.MOD_ID,"sourberry")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Fevo.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Fevo.LOGGER.info("Registering Mod Items for " + Fevo.MOD_ID);

    }
}
