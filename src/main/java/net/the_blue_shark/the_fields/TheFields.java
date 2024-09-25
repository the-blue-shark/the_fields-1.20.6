package net.the_blue_shark.the_fields;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.the_blue_shark.the_fields.block.ModBlocks;
import net.the_blue_shark.the_fields.item.ModItemGroups;
import net.the_blue_shark.the_fields.item.ModItems;
import net.the_blue_shark.the_fields.util.ModRegistries;
import net.the_blue_shark.the_fields.util.ModTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheFields implements ModInitializer {
	public static final String MOD_ID = "the_fields";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();




		LOGGER.info("The Fields has successfully initialized!");
	}
}