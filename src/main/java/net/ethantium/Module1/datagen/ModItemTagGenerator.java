package net.ethantium.Module1.datagen;

import net.ethantium.Module1.Module1;
import net.ethantium.Module1.item.ModItems;
import net.ethantium.Module1.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupCompletableFuture, CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupCompletableFuture, completableFuture, Module1.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANFORMABLE_ITEMS)
                .add(ModItems.AZURITE.get())
                .add(ModItems.RAW_AZURITE.get())
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.DIAMOND);
    }
}
