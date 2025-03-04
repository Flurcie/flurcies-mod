package flurcie.fevo.entity;

import flurcie.fevo.Fevo;
//import flurcie.fevo.entity.custom.BoarfishEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    //public static final EntityType<BoarfishEntity> BOARFISH = Registry.register(Registries.ENTITY_TYPE,
    //        Identifier.of(Fevo.MOD_ID, "boarfish"),
    //      EntityType.Builder.create(BoarfishEntity::new, SpawnGroup.WATER_AMBIENT)
    //              .dimensions(1f, 2.5f).build());


    public static void registerModEntities() {
        Fevo.LOGGER.info("Registering Mod Entities for " + Fevo.MOD_ID);
    }
}
