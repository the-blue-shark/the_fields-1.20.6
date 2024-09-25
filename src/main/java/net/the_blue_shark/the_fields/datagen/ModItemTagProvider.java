package net.the_blue_shark.the_fields.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.the_blue_shark.the_fields.block.ModBlocks;
import net.the_blue_shark.the_fields.item.ModItems;
import net.the_blue_shark.the_fields.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.MOD_SEEDS)
                .add(ModItems.CORN_SEEDS)
                .add(ModItems.COTTON_SEEDS)
                .add(ModItems.PEPPER_SEEDS)
                .add(ModItems.TOMATO_SEEDS)
                .add(ModItems.STRAWBERRY_SEEDS);
    }
}
