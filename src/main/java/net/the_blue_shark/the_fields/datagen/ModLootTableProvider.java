package net.the_blue_shark.the_fields.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.the_blue_shark.the_fields.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLACK_COTTON);
        addDrop(ModBlocks.WHITE_COTTON);
        addDrop(ModBlocks.BLUE_COTTON);
        addDrop(ModBlocks.LIGHT_BLUE_COTTON);
        addDrop(ModBlocks.RED_COTTON);
        addDrop(ModBlocks.ORANGE_COTTON);
        addDrop(ModBlocks.YELLOW_COTTON);
        addDrop(ModBlocks.LIME_COTTON);
        addDrop(ModBlocks.GREEN_COTTON);
        addDrop(ModBlocks.CYAN_COTTON);
        addDrop(ModBlocks.PURPLE_COTTON);
        addDrop(ModBlocks.MAGENTA_COTTON);
        addDrop(ModBlocks.PINK_COTTON);
        addDrop(ModBlocks.BROWN_COTTON);
        addDrop(ModBlocks.GRAY_COTTON);
        addDrop(ModBlocks.LIGHT_GRAY_COTTON);

        addDrop(ModBlocks.BLACK_COTTON_CARPET);
        addDrop(ModBlocks.WHITE_COTTON_CARPET);
        addDrop(ModBlocks.BLUE_COTTON_CARPET);
        addDrop(ModBlocks.LIGHT_BLUE_COTTON_CARPET);
        addDrop(ModBlocks.RED_COTTON_CARPET);
        addDrop(ModBlocks.ORANGE_COTTON_CARPET);
        addDrop(ModBlocks.YELLOW_COTTON_CARPET);
        addDrop(ModBlocks.LIME_COTTON_CARPET);
        addDrop(ModBlocks.GREEN_COTTON_CARPET);
        addDrop(ModBlocks.CYAN_COTTON_CARPET);
        addDrop(ModBlocks.PURPLE_COTTON_CARPET);
        addDrop(ModBlocks.MAGENTA_COTTON_CARPET);
        addDrop(ModBlocks.PINK_COTTON_CARPET);
        addDrop(ModBlocks.BROWN_COTTON_CARPET);
        addDrop(ModBlocks.GRAY_COTTON_CARPET);
        addDrop(ModBlocks.LIGHT_GRAY_COTTON_CARPET);



    }
}
