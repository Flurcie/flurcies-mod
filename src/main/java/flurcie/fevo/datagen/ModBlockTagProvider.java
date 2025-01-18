package flurcie.fevo.datagen;

import flurcie.fevo.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.GRANITE_BRICK_STAIRS)
                .add(ModBlocks.GRANITE_BRICK_SLAB)
                .add(ModBlocks.GRANITE_BRICK_WALL)

                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.DIORITE_BRICK_STAIRS)
                .add(ModBlocks.DIORITE_BRICK_SLAB)
                .add(ModBlocks.DIORITE_BRICK_WALL)

                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.ANDESITE_BRICK_STAIRS)
                .add(ModBlocks.ANDESITE_BRICK_SLAB)
                .add(ModBlocks.ANDESITE_BRICK_WALL)

                .add(ModBlocks.BASALT_BRICKS)
                .add(ModBlocks.BASALT_BRICK_STAIRS)
                .add(ModBlocks.BASALT_BRICK_SLAB)
                .add(ModBlocks.BASALT_BRICK_WALL)

                .add(ModBlocks.SANDSTONE_BRICKS)
                .add(ModBlocks.SANDSTONE_BRICK_STAIRS)
                .add(ModBlocks.SANDSTONE_BRICK_SLAB)
                .add(ModBlocks.SANDSTONE_BRICK_WALL)

                .add(ModBlocks.RED_SANDSTONE_BRICKS)
                .add(ModBlocks.RED_SANDSTONE_BRICK_STAIRS)
                .add(ModBlocks.RED_SANDSTONE_BRICK_SLAB)
                .add(ModBlocks.RED_SANDSTONE_BRICK_WALL)

                .add(ModBlocks.QUARTZ_BRICK_STAIRS)
                .add(ModBlocks.QUARTZ_BRICK_SLAB)
                .add(ModBlocks.QUARTZ_BRICK_WALL)
                .add(ModBlocks.QUARTZ_WALL)
                .add(ModBlocks.SMOOTH_QUARTZ_WALL)
                .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL)
                .add(ModBlocks.SMOOTH_BASALT_SLAB)
                .add(ModBlocks.SMOOTH_BASALT_STAIRS)
                .add(ModBlocks.SMOOTH_BASALT_WALL)

                .add(ModBlocks.POLISHED_GRANITE_WALL)
                .add(ModBlocks.POLISHED_DIORITE_WALL)
                .add(ModBlocks.POLISHED_ANDESITE_WALL)

        ;
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.GRANITE_BRICK_WALL)
                .add(ModBlocks.DIORITE_BRICK_WALL)
                .add(ModBlocks.ANDESITE_BRICK_WALL)
                .add(ModBlocks.BASALT_BRICK_WALL)
                .add(ModBlocks.SANDSTONE_BRICK_WALL)
                .add(ModBlocks.RED_SANDSTONE_BRICK_WALL)
                .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL)
                .add(ModBlocks.SMOOTH_BASALT_WALL)
                .add(ModBlocks.QUARTZ_WALL)
                .add(ModBlocks.SMOOTH_QUARTZ_WALL)
                .add(ModBlocks.QUARTZ_BRICK_WALL)
                .add(ModBlocks.POLISHED_GRANITE_WALL)
                .add(ModBlocks.POLISHED_DIORITE_WALL)
                .add(ModBlocks.POLISHED_ANDESITE_WALL)

        ;
    }
}