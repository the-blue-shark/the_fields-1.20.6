package net.the_blue_shark.the_fields.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.the_blue_shark.the_fields.TheFields;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TheFields.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MOD_SEEDS = createTag("mod_seeds");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TheFields.MOD_ID, name));
        }
    }
}
