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

    public static final Item EDIBLE_COTTON_SEEDS = registerItem("edible_cotton_seeds",
            new Item(new Item.Settings().food(ModFoodComponents.EDIBLE_COTTON_SEEDS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheFields.MOD_ID, name), item);
    }

    private static void itemGroupNatural(FabricItemGroupEntries entries) {
        entries.add(COTTON);
        entries.add(COTTON_SEEDS);
    }
    private static void itemGroupFoodAndDrink(FabricItemGroupEntries entries) {
        entries.add(EDIBLE_COTTON_SEEDS);
    }

    public static void registerModItems() {
        TheFields.LOGGER.info("Registering Mod Items for " + TheFields.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::itemGroupNatural);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::itemGroupFoodAndDrink);
    }
}
