package flurcie.fevo.block;

import flurcie.fevo.Fevo;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "granite_bricks")))
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
        new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(),
                AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "granite_brick_stairs")))
                        .mapColor(MapColor.DIRT_BROWN)
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool()
                        .strength(1.5F, 6.0F)));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "granite_brick_slab")))
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "granite_brick_wall")))
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));


    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
    new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "diorite_bricks")))
            .mapColor(MapColor.OFF_WHITE)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(1.5F, 6.0F)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "diorite_brick_stairs")))
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "diorite_brick_slab")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "diorite_brick_wall")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));


    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "andesite_bricks")))
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "andesite_brick_stairs")))
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "andesite_brick_slab")))
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "andesite_brick_wall")))
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));

    public static final Block BASALT_BRICKS = registerBlock("basalt_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "basalt_bricks")))
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stairs",
            new StairsBlock(ModBlocks.BASALT_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "basalt_brick_stairs")))
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.25F, 4.2F)));
    public static final Block BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "basalt_brick_slab")))
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F)));
    public static final Block BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "basalt_brick_wall")))
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F)));


    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "sandstone_bricks")))
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            new StairsBlock(ModBlocks.SANDSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "sandstone_brick_stairs")))
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(0.8F)));
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "sandstone_brick_slab")))
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "sandstone_brick_wall")))
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "red_sandstone_bricks")))
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            new StairsBlock(ModBlocks.RED_SANDSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "red_sandstone_brick_stairs")))
                            .mapColor(MapColor.ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(0.8F)));
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "red_sandstone_brick_slab")))
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "red_sandstone_brick_wall")))
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block FEVOSMOOTH_SANDSTONE = registerBlock("fevosmooth_sandstone",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "fevosmooth_sandstone")))
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block FEVOSMOOTH_RED_SANDSTONE = registerBlock("fevosmooth_red_sandstone",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "fevosmooth_red_sandstone")))
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "smooth_sandstone_wall")))
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "smooth_red_sandstone_wall")))
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block FEVOSMOOTH_BASALT = registerBlock("fevosmooth_basalt",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "fevosmooth_basalt")))
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(ModBlocks.FEVOSMOOTH_BASALT.getDefaultState(),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "smooth_basalt_stairs")))
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(0.8F)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "smooth_basalt_slab")))
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "smooth_basalt_wall")))
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.BASALT)));


    public static final Block FEVOQUARTZ_BLOCK = registerBlock("fevoquartz_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "fevoquartz_block")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "quartz_wall")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block FEVOSMOOTH_QUARTZ = registerBlock("fevosmooth_quartz",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "fevosmooth_quartz")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "smooth_quartz_wall")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block FEVOQUARTZ_BRICKS = registerBlock("fevoquartz_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "fevoquartz_bricks")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(ModBlocks.FEVOQUARTZ_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "quartz_brick_stairs")))
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(0.8F)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "quartz_brick_slab")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "quartz_brick_wall")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block FEVOPOLISHED_GRANITE = registerBlock("fevopolished_granite",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "fevopolished_granite")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block FEVOPOLISHED_DIORITE = registerBlock("fevopolished_diorite",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "fevopolished_diorite")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));
    public static final Block FEVOPOLISHED_ANDESITE = registerBlock("fevopolished_andesite",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "fevopolished_andesite")))
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "polished_granite_wall")))
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "polished_diorite_wall")))
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "polished_andesite_wall")))
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));

    public static final Block FEVOSTONE = registerBlock("fevostone",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "polished_andesite_wall")))
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));
    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fevo.MOD_ID, "stone_wall")))
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Fevo.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Fevo.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Fevo.MOD_ID, name)))
                        .useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        Fevo.LOGGER.info("Registering Mod Blocks for" + Fevo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(GRANITE_BRICKS);
            fabricItemGroupEntries.add(GRANITE_BRICK_STAIRS);
            fabricItemGroupEntries.add(GRANITE_BRICK_SLAB);
            fabricItemGroupEntries.add(GRANITE_BRICK_WALL);

            fabricItemGroupEntries.add(DIORITE_BRICKS);
            fabricItemGroupEntries.add(DIORITE_BRICK_STAIRS);
            fabricItemGroupEntries.add(DIORITE_BRICK_SLAB);
            fabricItemGroupEntries.add(DIORITE_BRICK_WALL);

            fabricItemGroupEntries.add(ANDESITE_BRICKS);
            fabricItemGroupEntries.add(ANDESITE_BRICK_STAIRS);
            fabricItemGroupEntries.add(ANDESITE_BRICK_SLAB);
            fabricItemGroupEntries.add(ANDESITE_BRICK_WALL);

            fabricItemGroupEntries.add(BASALT_BRICKS);
            fabricItemGroupEntries.add(BASALT_BRICK_STAIRS);
            fabricItemGroupEntries.add(BASALT_BRICK_SLAB);
            fabricItemGroupEntries.add(BASALT_BRICK_WALL);

            fabricItemGroupEntries.add(SANDSTONE_BRICKS);
            fabricItemGroupEntries.add(SANDSTONE_BRICK_STAIRS);
            fabricItemGroupEntries.add(SANDSTONE_BRICK_SLAB);
            fabricItemGroupEntries.add(SANDSTONE_BRICK_WALL);

            fabricItemGroupEntries.add(RED_SANDSTONE_BRICKS);
            fabricItemGroupEntries.add(RED_SANDSTONE_BRICK_STAIRS);
            fabricItemGroupEntries.add(RED_SANDSTONE_BRICK_SLAB);
            fabricItemGroupEntries.add(RED_SANDSTONE_BRICK_WALL);

            fabricItemGroupEntries.add(SMOOTH_SANDSTONE_WALL);
            fabricItemGroupEntries.add(SMOOTH_RED_SANDSTONE_WALL);
            fabricItemGroupEntries.add(SMOOTH_BASALT_WALL);
            fabricItemGroupEntries.add(SMOOTH_BASALT_STAIRS);
            fabricItemGroupEntries.add(SMOOTH_BASALT_SLAB);
            fabricItemGroupEntries.add(QUARTZ_WALL);
            fabricItemGroupEntries.add(SMOOTH_QUARTZ_WALL);
            fabricItemGroupEntries.add(QUARTZ_BRICK_SLAB);
            fabricItemGroupEntries.add(QUARTZ_BRICK_STAIRS);
            fabricItemGroupEntries.add(QUARTZ_BRICK_WALL);

            fabricItemGroupEntries.add(POLISHED_GRANITE_WALL);
            fabricItemGroupEntries.add(POLISHED_DIORITE_WALL);
            fabricItemGroupEntries.add(POLISHED_ANDESITE_WALL);

            fabricItemGroupEntries.add(STONE_WALL);

        });
    }
}