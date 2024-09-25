package net.the_blue_shark.the_fields.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.the_blue_shark.the_fields.block.ModBlocks;
import net.the_blue_shark.the_fields.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RED_TOMATO, RecipeCategory.DECORATIONS, ModBlocks.TOMATO_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COTTON, RecipeCategory.DECORATIONS, ModBlocks.COTTON_CRATE);

        offerCarpetRecipe(exporter, ModBlocks.BLACK_COTTON_CARPET, ModBlocks.BLACK_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.WHITE_COTTON_CARPET, ModBlocks.WHITE_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.BLUE_COTTON_CARPET, ModBlocks.BLUE_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.LIGHT_BLUE_COTTON_CARPET, ModBlocks.LIGHT_BLUE_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.RED_COTTON_CARPET, ModBlocks.RED_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.ORANGE_COTTON_CARPET, ModBlocks.ORANGE_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.YELLOW_COTTON_CARPET, ModBlocks.YELLOW_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.LIME_COTTON_CARPET, ModBlocks.LIME_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.GREEN_COTTON_CARPET, ModBlocks.GREEN_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.CYAN_COTTON_CARPET, ModBlocks.CYAN_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.PURPLE_COTTON_CARPET, ModBlocks.PURPLE_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.MAGENTA_COTTON_CARPET, ModBlocks.MAGENTA_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.PINK_COTTON_CARPET, ModBlocks.PINK_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.BROWN_COTTON_CARPET, ModBlocks.BROWN_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.GRAY_COTTON_CARPET, ModBlocks.GRAY_COTTON);
        offerCarpetRecipe(exporter, ModBlocks.LIGHT_GRAY_COTTON_CARPET, ModBlocks.LIGHT_GRAY_COTTON);

        offerCottonDyingRecipe(exporter, ModBlocks.BLACK_COTTON, Items.BLACK_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.RED_COTTON, Items.RED_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.GREEN_COTTON, Items.GREEN_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.BROWN_COTTON, Items.BROWN_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.BLUE_COTTON, Items.BLUE_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.PURPLE_COTTON, Items.PURPLE_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.CYAN_COTTON, Items.CYAN_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.LIGHT_GRAY_COTTON, Items.LIGHT_GRAY_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.GRAY_COTTON, Items.GRAY_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.PINK_COTTON, Items.PINK_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.LIME_COTTON, Items.LIME_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.YELLOW_COTTON, Items.YELLOW_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.LIGHT_BLUE_COTTON, Items.LIGHT_BLUE_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.MAGENTA_COTTON, Items.MAGENTA_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.ORANGE_COTTON, Items.ORANGE_DYE);
        offerCottonDyingRecipe(exporter, ModBlocks.WHITE_COTTON, Items.WHITE_DYE);



    }
    public static void offerCottonDyingRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 2).input(input).input(ModItems.COTTON, 8).criterion(hasItem(ModItems.COTTON), conditionsFromItem(ModItems.COTTON)).offerTo(exporter);
    }
}
