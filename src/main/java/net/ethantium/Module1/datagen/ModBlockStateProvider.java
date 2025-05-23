package net.ethantium.Module1.datagen;

import net.ethantium.Module1.Module1;
import net.ethantium.Module1.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Module1.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AZURITE_BLOCK);
        blockWithItem(ModBlocks.AZURITE_ORE);
        blockWithItem(ModBlocks.AZURITE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.AZURITE_NETHER_ORE);
        blockWithItem(ModBlocks.AZURITE_END_ORE);
        blockWithItem(ModBlocks.MAGIC_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.AZURITE_STAIRS.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.AZURITE_SLAB.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));

        blockItem(ModBlocks.AZURITE_STAIRS);
        blockItem(ModBlocks.AZURITE_SLAB);

        buttonBlock(((ButtonBlock) ModBlocks.AZURITE_BUTTON.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.AZURITE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));

        blockItem(ModBlocks.AZURITE_PRESSURE_PLATE);

        fenceBlock(((FenceBlock) ModBlocks.AZURITE_FENCE.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.AZURITE_FENCE_GATE.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.AZURITE_WALL.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));

        blockItem(ModBlocks.AZURITE_FENCE_GATE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("module1:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("module1:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
