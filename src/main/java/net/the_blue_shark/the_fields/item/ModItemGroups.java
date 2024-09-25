package net.the_blue_shark.the_fields.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.the_blue_shark.the_fields.TheFields;
import net.the_blue_shark.the_fields.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup THE_FIELDS_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheFields.MOD_ID, "the_fields_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.STRAWBERRY))
                    .displayName(Text.translatable("itemgroup.the_fields.the_fields_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.COTTON);
                        entries.add(ModItems.PEPPER);
                        entries.add(ModItems.GREEN_TOMATO);
                        entries.add(ModItems.YELLOW_TOMATO);
                        entries.add(ModItems.RED_TOMATO);
                        entries.add(ModItems.STRAWBERRY);

                        entries.add(ModItems.COTTON_SEEDS);
                        entries.add(ModItems.CORN_SEEDS);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.PEPPER_SEEDS);
                        entries.add(ModItems.STRAWBERRY_SEEDS);

                        entries.add(ModBlocks.COTTON_CRATE);
                        entries.add(ModBlocks.TOMATO_CRATE);

                        entries.add(ModBlocks.BLACK_COTTON);
                        entries.add(ModBlocks.WHITE_COTTON);
                        entries.add(ModBlocks.BLUE_COTTON);
                        entries.add(ModBlocks.LIGHT_BLUE_COTTON);
                        entries.add(ModBlocks.RED_COTTON);
                        entries.add(ModBlocks.ORANGE_COTTON);
                        entries.add(ModBlocks.YELLOW_COTTON);
                        entries.add(ModBlocks.LIME_COTTON);
                        entries.add(ModBlocks.GREEN_COTTON);
                        entries.add(ModBlocks.CYAN_COTTON);
                        entries.add(ModBlocks.PURPLE_COTTON);
                        entries.add(ModBlocks.MAGENTA_COTTON);
                        entries.add(ModBlocks.PINK_COTTON);
                        entries.add(ModBlocks.BROWN_COTTON);
                        entries.add(ModBlocks.GRAY_COTTON);
                        entries.add(ModBlocks.LIGHT_GRAY_COTTON);

                        entries.add(ModBlocks.BLACK_COTTON_CARPET);
                        entries.add(ModBlocks.WHITE_COTTON_CARPET);
                        entries.add(ModBlocks.BLUE_COTTON_CARPET);
                        entries.add(ModBlocks.LIGHT_BLUE_COTTON_CARPET);
                        entries.add(ModBlocks.RED_COTTON_CARPET);
                        entries.add(ModBlocks.ORANGE_COTTON_CARPET);
                        entries.add(ModBlocks.YELLOW_COTTON_CARPET);
                        entries.add(ModBlocks.LIME_COTTON_CARPET);
                        entries.add(ModBlocks.GREEN_COTTON_CARPET);
                        entries.add(ModBlocks.CYAN_COTTON_CARPET);
                        entries.add(ModBlocks.PURPLE_COTTON_CARPET);
                        entries.add(ModBlocks.MAGENTA_COTTON_CARPET);
                        entries.add(ModBlocks.PINK_COTTON_CARPET);
                        entries.add(ModBlocks.BROWN_COTTON_CARPET);
                        entries.add(ModBlocks.GRAY_COTTON_CARPET);
                        entries.add(ModBlocks.LIGHT_GRAY_COTTON_CARPET);

                    }).build());


    public static void registerItemGroups() {
        TheFields.LOGGER.info("Registering Item Groups for " + TheFields.MOD_ID);
    }
}
