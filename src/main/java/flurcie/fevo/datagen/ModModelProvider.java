package flurcie.fevo.datagen;

import flurcie.fevo.block.ModBlocks;
import flurcie.fevo.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;



public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool graniteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS);
        graniteBrickPool.slab(ModBlocks.GRANITE_BRICK_SLAB);
        graniteBrickPool.stairs(ModBlocks.GRANITE_BRICK_STAIRS);
        graniteBrickPool.wall(ModBlocks.GRANITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool dioriteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS);
        dioriteBrickPool.slab(ModBlocks.DIORITE_BRICK_SLAB);
        dioriteBrickPool.stairs(ModBlocks.DIORITE_BRICK_STAIRS);
        dioriteBrickPool.wall(ModBlocks.DIORITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool andesiteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);
        andesiteBrickPool.slab(ModBlocks.ANDESITE_BRICK_SLAB);
        andesiteBrickPool.stairs(ModBlocks.ANDESITE_BRICK_STAIRS);
        andesiteBrickPool.wall(ModBlocks.ANDESITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool basaltBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BASALT_BRICKS);
        basaltBrickPool.slab(ModBlocks.BASALT_BRICK_SLAB);
        basaltBrickPool.stairs(ModBlocks.BASALT_BRICK_STAIRS);
        basaltBrickPool.wall(ModBlocks.BASALT_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool sandstoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDSTONE_BRICKS);
        sandstoneBrickPool.slab(ModBlocks.SANDSTONE_BRICK_SLAB);
        sandstoneBrickPool.stairs(ModBlocks.SANDSTONE_BRICK_STAIRS);
        sandstoneBrickPool.wall(ModBlocks.SANDSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool redSandstoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_SANDSTONE_BRICKS);
        redSandstoneBrickPool.slab(ModBlocks.RED_SANDSTONE_BRICK_SLAB);
        redSandstoneBrickPool.stairs(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redSandstoneBrickPool.wall(ModBlocks.RED_SANDSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FEVOSMOOTH_SANDSTONE);
        smoothSandstonePool.wall(ModBlocks.SMOOTH_SANDSTONE_WALL);
        BlockStateModelGenerator.BlockTexturePool smoothRedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FEVOSMOOTH_RED_SANDSTONE);
        smoothRedSandstonePool.wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        BlockStateModelGenerator.BlockTexturePool smoothBasaltPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FEVOSMOOTH_BASALT);
        smoothBasaltPool.wall(ModBlocks.SMOOTH_BASALT_WALL);
        smoothBasaltPool.stairs(ModBlocks.SMOOTH_BASALT_STAIRS);
        smoothBasaltPool.slab(ModBlocks.SMOOTH_BASALT_SLAB);
        BlockStateModelGenerator.BlockTexturePool QuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FEVOQUARTZ_BLOCK);
        QuartzPool.wall(ModBlocks.QUARTZ_WALL);
        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FEVOSMOOTH_QUARTZ);
        smoothQuartzPool.wall(ModBlocks.SMOOTH_QUARTZ_WALL);
        BlockStateModelGenerator.BlockTexturePool quartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FEVOQUARTZ_BRICKS);
        quartzBrickPool.stairs(ModBlocks.QUARTZ_BRICK_STAIRS);
        quartzBrickPool.slab(ModBlocks.QUARTZ_BRICK_SLAB);
        quartzBrickPool.wall(ModBlocks.QUARTZ_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SOURBERRY, Models.GENERATED);
    }
}
