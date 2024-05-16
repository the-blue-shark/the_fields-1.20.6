package net.the_blue_shark.the_fields.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the_blue_shark.the_fields.TheFields;
import net.the_blue_shark.the_fields.block.custom.CottonCropBlock;

public class ModBlocks {
    public static final Block COTTON_CRATE = registerBlock("cotton_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block COTTON_CROP = registerBlockWithoutBlockItem("cotton_crop",
            new CottonCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(TheFields.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheFields.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TheFields.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TheFields.LOGGER.info("Registering ModBlocks for " + TheFields.MOD_ID);
    }
}
