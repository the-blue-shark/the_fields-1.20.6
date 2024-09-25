package net.the_blue_shark.the_fields.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the_blue_shark.the_fields.TheFields;
import net.the_blue_shark.the_fields.block.custom.*;

public class ModBlocks {
    public static final Block COTTON_CRATE = registerBlock("cotton_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block TOMATO_CRATE = registerBlock("tomato_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block COTTON_CROP = registerBlockWithoutBlockItem("cotton_crop",
            new CottonCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    public static final Block CORN_CROP = registerBlockWithoutBlockItem("corn_crop",
            new CornCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    public static final Block TOMATO_CROP = registerBlockWithoutBlockItem("tomato_crop",
            new TomatoCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    public static final Block PEPPER_CROP = registerBlockWithoutBlockItem("pepper_crop",
            new PepperCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    public static final Block STRAWBERRY_CROP = registerBlockWithoutBlockItem("strawberry_crop",
            new StrawberryCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));


    public static final Block BLACK_COTTON = registerBlock("black_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block WHITE_COTTON = registerBlock("white_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block BLUE_COTTON = registerBlock("blue_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block LIGHT_BLUE_COTTON = registerBlock("light_blue_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block RED_COTTON = registerBlock("red_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block ORANGE_COTTON = registerBlock("orange_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block YELLOW_COTTON = registerBlock("yellow_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block LIME_COTTON = registerBlock("lime_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block GREEN_COTTON = registerBlock("green_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block CYAN_COTTON = registerBlock("cyan_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block PURPLE_COTTON = registerBlock("purple_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block MAGENTA_COTTON = registerBlock("magenta_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block PINK_COTTON = registerBlock("pink_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block BROWN_COTTON = registerBlock("brown_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block GRAY_COTTON = registerBlock("gray_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block LIGHT_GRAY_COTTON = registerBlock("light_gray_cotton",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));

    public static final Block BLACK_COTTON_CARPET = registerBlock("black_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)));
    public static final Block WHITE_COTTON_CARPET = registerBlock("white_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)));
    public static final Block BLUE_COTTON_CARPET = registerBlock("blue_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)));
    public static final Block LIGHT_BLUE_COTTON_CARPET = registerBlock("light_blue_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)));
    public static final Block RED_COTTON_CARPET = registerBlock("red_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.RED_CARPET)));
    public static final Block ORANGE_COTTON_CARPET = registerBlock("orange_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)));
    public static final Block YELLOW_COTTON_CARPET = registerBlock("yellow_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)));
    public static final Block LIME_COTTON_CARPET = registerBlock("lime_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIME_CARPET)));
    public static final Block GREEN_COTTON_CARPET = registerBlock("green_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)));
    public static final Block CYAN_COTTON_CARPET = registerBlock("cyan_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)));
    public static final Block PURPLE_COTTON_CARPET = registerBlock("purple_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)));
    public static final Block MAGENTA_COTTON_CARPET = registerBlock("magenta_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)));
    public static final Block PINK_COTTON_CARPET = registerBlock("pink_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.PINK_CARPET)));
    public static final Block BROWN_COTTON_CARPET = registerBlock("brown_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)));
    public static final Block GRAY_COTTON_CARPET = registerBlock("gray_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)));
    public static final Block LIGHT_GRAY_COTTON_CARPET = registerBlock("light_gray_cotton_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)));




    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(TheFields.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TheFields.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TheFields.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TheFields.LOGGER.info("Registering Mod Blocks for " + TheFields.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.COTTON_CRATE);
            entries.add(ModBlocks.TOMATO_CRATE);
        });
    }
}
