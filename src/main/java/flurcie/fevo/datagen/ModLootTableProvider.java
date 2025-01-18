package flurcie.fevo.datagen;

import flurcie.fevo.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GRANITE_BRICKS);
        addDrop(ModBlocks.GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.GRANITE_BRICK_SLAB, slabDrops(ModBlocks.GRANITE_BRICK_SLAB));
        addDrop(ModBlocks.GRANITE_BRICK_WALL);

        addDrop(ModBlocks.DIORITE_BRICKS);
        addDrop(ModBlocks.DIORITE_BRICK_STAIRS);
        addDrop(ModBlocks.DIORITE_BRICK_SLAB);
        addDrop(ModBlocks.DIORITE_BRICK_WALL);

        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.ANDESITE_BRICK_STAIRS);
        addDrop(ModBlocks.ANDESITE_BRICK_SLAB);
        addDrop(ModBlocks.ANDESITE_BRICK_WALL);

        addDrop(ModBlocks.BASALT_BRICKS);
        addDrop(ModBlocks.BASALT_BRICK_STAIRS);
        addDrop(ModBlocks.BASALT_BRICK_SLAB);
        addDrop(ModBlocks.BASALT_BRICK_WALL);

        addDrop(ModBlocks.SANDSTONE_BRICKS);
        addDrop(ModBlocks.SANDSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.SANDSTONE_BRICK_SLAB);
        addDrop(ModBlocks.SANDSTONE_BRICK_WALL);

        addDrop(ModBlocks.RED_SANDSTONE_BRICKS);
        addDrop(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.RED_SANDSTONE_BRICK_SLAB);
        addDrop(ModBlocks.RED_SANDSTONE_BRICK_WALL);

        addDrop(ModBlocks.SMOOTH_SANDSTONE_WALL);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);
        addDrop(ModBlocks.QUARTZ_WALL);
        addDrop(ModBlocks.SMOOTH_QUARTZ_WALL);
        addDrop(ModBlocks.SMOOTH_BASALT_SLAB);
        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);
        addDrop(ModBlocks.QUARTZ_BRICK_STAIRS);
        addDrop(ModBlocks.QUARTZ_BRICK_SLAB);
        addDrop(ModBlocks.QUARTZ_BRICK_WALL);

        addDrop(ModBlocks.POLISHED_GRANITE_WALL);
        addDrop(ModBlocks.POLISHED_DIORITE_WALL);
        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);
    }
}
