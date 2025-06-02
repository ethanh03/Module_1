package net.ethantium.Module1.util;

import net.ethantium.Module1.Module1;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_AZURITE_TOOL = createTag("needs_azurite_tool");
        public static final TagKey<Block> INCORRECT_FOR_AZURITE_TOOL = createTag("incorrect_for_azurite_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Module1.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Module1.MOD_ID, name));
        }
    }
}
