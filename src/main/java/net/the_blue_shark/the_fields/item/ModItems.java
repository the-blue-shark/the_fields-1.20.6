package net.the_blue_shark.the_fields.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the_blue_shark.the_fields.TheFields;
import net.the_blue_shark.the_fields.block.ModBlocks;

public class ModItems {
    public static final Item COTTON = registerItem("cotton",
            new Item(new Item.Settings()));

    public static final Item COTTON_SEEDS = registerItem("cotton_seeds",
            new AliasedBlockItem(ModBlocks.COTTON_CROP, new Item.Settings()));

    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN_CROP, new Item.Settings()));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings()));

    public static final Item PEPPER_SEEDS = registerItem("pepper_seeds",
            new AliasedBlockItem(ModBlocks.PEPPER_CROP, new Item.Settings()));

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_CROP, new Item.Settings()));

    public static final Item EDIBLE_COTTON_SEEDS = registerItem("edible_cotton_seeds",
            new Item(new Item.Settings().food(ModFoodComponents.EDIBLE_COTTON_SEEDS)));

    public static final Item RED_TOMATO = registerItem("red_tomato",
            new Item(new Item.Settings().food(ModFoodComponents.RED_TOMATO)));

    public static final Item YELLOW_TOMATO = registerItem("yellow_tomato",
            new Item(new Item.Settings().food(ModFoodComponents.YELLOW_TOMATO)));

    public static final Item GREEN_TOMATO = registerItem("green_tomato",
            new Item(new Item.Settings().food(ModFoodComponents.GREEN_TOMATO)));

    public static final Item PEPPER = registerItem("pepper",
            new Item(new Item.Settings().food(ModFoodComponents.PEPPER)));

    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));

    public static final Item CORN = registerItem("corn",
            new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheFields.MOD_ID, name), item);
    }

    private static void itemGroupNatural(FabricItemGroupEntries entries) {
        entries.add(COTTON);
        entries.add(PEPPER);
        entries.add(GREEN_TOMATO);
        entries.add(YELLOW_TOMATO);
        entries.add(RED_TOMATO);
        entries.add(COTTON_SEEDS);
        entries.add(CORN_SEEDS);
        entries.add(TOMATO_SEEDS);
        entries.add(PEPPER_SEEDS);
    }
    private static void itemGroupFoodAndDrink(FabricItemGroupEntries entries) {
        entries.add(EDIBLE_COTTON_SEEDS);
        entries.add(PEPPER);
        entries.add(GREEN_TOMATO);
        entries.add(YELLOW_TOMATO);
        entries.add(RED_TOMATO);
        entries.add(STRAWBERRY);

    }

    public static void registerModItems() {
        TheFields.LOGGER.info("Registering Mod Items for " + TheFields.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::itemGroupNatural);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::itemGroupFoodAndDrink);
    }
}
