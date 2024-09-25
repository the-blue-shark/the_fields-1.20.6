package net.the_blue_shark.the_fields.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.the_blue_shark.the_fields.block.ModBlocks;
import net.the_blue_shark.the_fields.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BLACK_COTTON, ModBlocks.BLACK_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_COTTON, ModBlocks.WHITE_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BLUE_COTTON, ModBlocks.BLUE_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIGHT_BLUE_COTTON, ModBlocks.LIGHT_BLUE_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.RED_COTTON, ModBlocks.RED_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.ORANGE_COTTON, ModBlocks.ORANGE_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.YELLOW_COTTON, ModBlocks.YELLOW_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIME_COTTON, ModBlocks.LIME_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.GREEN_COTTON, ModBlocks.GREEN_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.CYAN_COTTON, ModBlocks.CYAN_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.PURPLE_COTTON, ModBlocks.PURPLE_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.MAGENTA_COTTON, ModBlocks.MAGENTA_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.PINK_COTTON, ModBlocks.PINK_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BROWN_COTTON, ModBlocks.BROWN_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.GRAY_COTTON, ModBlocks.GRAY_COTTON_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIGHT_GRAY_COTTON, ModBlocks.LIGHT_GRAY_COTTON_CARPET);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
    }
}
