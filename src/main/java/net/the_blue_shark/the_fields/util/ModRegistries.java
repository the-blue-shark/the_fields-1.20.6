package net.the_blue_shark.the_fields.util;


import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.the_blue_shark.the_fields.block.ModBlocks;
import net.the_blue_shark.the_fields.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerFlammables();
        registerModCompostables();
        registerCustomTrades();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COTTON, 25);
        registry.add(ModBlocks.BLACK_COTTON, 100);
        registry.add(ModBlocks.WHITE_COTTON, 100);
        registry.add(ModBlocks.BLUE_COTTON, 100);
        registry.add(ModBlocks.LIGHT_BLUE_COTTON, 100);
        registry.add(ModBlocks.RED_COTTON, 100);
        registry.add(ModBlocks.ORANGE_COTTON, 100);
        registry.add(ModBlocks.YELLOW_COTTON, 100);
        registry.add(ModBlocks.LIME_COTTON, 100);
        registry.add(ModBlocks.GREEN_COTTON, 100);
        registry.add(ModBlocks.CYAN_COTTON, 100);
        registry.add(ModBlocks.PURPLE_COTTON, 100);
        registry.add(ModBlocks.MAGENTA_COTTON, 100);
        registry.add(ModBlocks.PINK_COTTON, 100);
        registry.add(ModBlocks.BROWN_COTTON, 100);
        registry.add(ModBlocks.GRAY_COTTON, 100);
        registry.add(ModBlocks.LIGHT_GRAY_COTTON, 100);

        registry.add(ModBlocks.BLACK_COTTON_CARPET, 67);
        registry.add(ModBlocks.WHITE_COTTON_CARPET, 67);
        registry.add(ModBlocks.BLUE_COTTON_CARPET, 67);
        registry.add(ModBlocks.LIGHT_BLUE_COTTON_CARPET, 67);
        registry.add(ModBlocks.RED_COTTON_CARPET, 67);
        registry.add(ModBlocks.ORANGE_COTTON_CARPET, 67);
        registry.add(ModBlocks.YELLOW_COTTON_CARPET, 67);
        registry.add(ModBlocks.LIME_COTTON_CARPET, 67);
        registry.add(ModBlocks.GREEN_COTTON_CARPET, 67);
        registry.add(ModBlocks.CYAN_COTTON_CARPET, 67);
        registry.add(ModBlocks.PURPLE_COTTON_CARPET, 67);
        registry.add(ModBlocks.MAGENTA_COTTON_CARPET, 67);
        registry.add(ModBlocks.PINK_COTTON_CARPET, 67);
        registry.add(ModBlocks.BROWN_COTTON_CARPET, 67);
        registry.add(ModBlocks.GRAY_COTTON_CARPET, 67);
        registry.add(ModBlocks.LIGHT_GRAY_COTTON_CARPET, 67);
    }

    private static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_COTTON, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_COTTON, 30, 60);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_COTTON_CARPET, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_COTTON_CARPET, 60, 20);

    }

    private static void registerModCompostables() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.COTTON_SEEDS, 0.25f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO_SEEDS, 0.25f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORN_SEEDS, 0.25f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.PEPPER_SEEDS, 0.25f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.STRAWBERRY_SEEDS, 0.25f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.EDIBLE_COTTON_SEEDS, 1f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.GREEN_TOMATO, 1f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.YELLOW_TOMATO, 1f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.RED_TOMATO, 1f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.PEPPER, 1f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.STRAWBERRY, 1f);
    }

    private static void registerCustomTrades() {


    }
}