package gtexpert.loaders.recipe.ingredients;

import static gregtech.api.unification.ore.OrePrefix.*;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.common.items.MetaItems;

import gtexpert.api.GTEValues;
import gtexpert.api.unification.material.GTEMaterials;
import gtexpert.api.util.GTEUtility;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;

public class AvaritiaRecipeLoader {

    public static void init() {
        materials();
    }

    private static void materials() {
        // ########################################
        // Neutronium
        // ########################################
        // Dust
        ModHandler.removeRecipeByOutput(GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "resource", 9, 2));
        ModHandler.addShapelessRecipe("neutronium_dust_trans-1", new ItemStack(ModItems.resource, 2, 2),
                OreDictUnifier.get(dustTiny, Materials.Neutronium), OreDictUnifier.get(dustTiny, Materials.Neutronium));
        ModHandler.addShapelessRecipe("neutronium_dust_trans-2", OreDictUnifier.get(dustTiny, Materials.Neutronium, 2),
                new ItemStack(ModItems.resource, 1, 2), new ItemStack(ModItems.resource, 1, 2));

        // Nugget
        ModHandler.removeRecipeByOutput(GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "resource", 1, 3));
        ModHandler.removeRecipeByOutput(GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "resource", 9, 3));
        ModHandler.addShapelessRecipe("neutronium_nugget_trans-1", new ItemStack(ModItems.resource, 2, 3),
                OreDictUnifier.get(nugget, Materials.Neutronium), OreDictUnifier.get(nugget, Materials.Neutronium));
        ModHandler.addShapelessRecipe("neutronium_nugget_trans-2", OreDictUnifier.get(nugget, Materials.Neutronium, 2),
                new ItemStack(ModItems.resource, 1, 3), new ItemStack(ModItems.resource, 1, 3));

        // Ingot
        ModHandler.removeRecipeByName(
                new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/un_neutronium_block"));
        ModHandler.addShapelessRecipe("neutronium_ingot_trans-1", new ItemStack(ModItems.resource, 2, 4),
                OreDictUnifier.get(ingot, Materials.Neutronium), OreDictUnifier.get(ingot, Materials.Neutronium));
        ModHandler.addShapelessRecipe("neutronium_ingot_trans-2", OreDictUnifier.get(ingot, Materials.Neutronium, 2),
                new ItemStack(ModItems.resource, 1, 4), new ItemStack(ModItems.resource, 1, 4));

        // Block
        ModHandler
                .removeRecipeByName(new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/neutronium_block"));
        ModHandler.addShapelessRecipe("neutronium_block_trans-1", new ItemStack(ModBlocks.resource, 2, 0),
                OreDictUnifier.get(block, GTEMaterials.Infinity), OreDictUnifier.get(block, Materials.Neutronium));
        ModHandler.addShapelessRecipe("neutronium_block_trans-2", OreDictUnifier.get(block, Materials.Neutronium, 2),
                new ItemStack(ModBlocks.resource, 1, 0), new ItemStack(ModBlocks.resource, 1, 0));
        RecipeMaps.COMPRESSOR_RECIPES.recipeBuilder()
                .input(ingot, Materials.Neutronium, 9)
                .output(block, Materials.Neutronium)
                .duration(300).EUt(2)
                .buildAndRegister();

        // ########################################
        // Crystal Matrix
        // ########################################
        // Ingot
        ModHandler.removeRecipeByName(
                new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/un_crystal_matrix_block"));
        // ModHandler.addMirroredShapedRecipe("avaritia_crystal_matrix_ingot",
        // GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "resource", 1, 1),
        // "I", 'I', OreDictUnifier.get(ingot, GTEMaterials.Infinity));
        // ModHandler.addMirroredShapedRecipe("ceu_crystal_matrix_block", OreDictUnifier.get(ingot,
        // GTEMaterials.Infinity),
        // "I", 'I', GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "resource", 1, 1));

        // Block
        ModHandler.removeRecipeByName(
                new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/crystal_matrix_block"));
        // ModHandler.addMirroredShapedRecipe("avaritia_crystal_matrix_ingot",
        // GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "block_resource", 1, 2),
        // "B", 'B', OreDictUnifier.get(block, GTEMaterials.CrystalMatrix));
        // ModHandler.addMirroredShapedRecipe("ceu_crystal_matrix_block", OreDictUnifier.get(block,
        // GTEMaterials.CrystalMatrix),
        // "B", 'B', GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "block_resource", 1, 2));
        RecipeMaps.COMPRESSOR_RECIPES.recipeBuilder()
                .inputs(GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "resource", 9, 1))
                .outputs(GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "block_resource", 1, 2))
                .duration(300).EUt(2)
                .buildAndRegister();
        RecipeMaps.ALLOY_SMELTER_RECIPES.recipeBuilder()
                .notConsumable(MetaItems.SHAPE_MOLD_INGOT)
                .inputs(GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "block_resource", 1, 2))
                .outputs(GTEUtility.getModItem(GTEValues.MODID_AVARITIA, "resource", 9, 1))
                .duration(400).EUt(2)
                .buildAndRegister();

        // ########################################
        // Infinity
        // ########################################
        // Ingot
        ModHandler.removeRecipeByName(
                new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/un_infinity_block"));
        ModHandler.addShapelessRecipe("infinity_ingot_trans-1", new ItemStack(ModItems.resource, 2, 6),
                OreDictUnifier.get(ingot, GTEMaterials.Infinity), OreDictUnifier.get(ingot, GTEMaterials.Infinity));
        ModHandler.addShapelessRecipe("infinity_ingot_trans-2", OreDictUnifier.get(ingot, GTEMaterials.Infinity, 2),
                new ItemStack(ModItems.resource, 1, 6), new ItemStack(ModItems.resource, 1, 6));

        // Block
        ModHandler.removeRecipeByName(new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/infinity_block"));
        ModHandler.addShapelessRecipe("infinity_block_trans-1", new ItemStack(ModBlocks.resource, 2, 1),
                OreDictUnifier.get(block, GTEMaterials.Infinity), OreDictUnifier.get(block, GTEMaterials.Infinity));
        ModHandler.addShapelessRecipe("infinity_block_trans-2", OreDictUnifier.get(block, GTEMaterials.Infinity, 2),
                new ItemStack(ModBlocks.resource, 1, 1), new ItemStack(ModBlocks.resource, 1, 1));
        RecipeMaps.COMPRESSOR_RECIPES.recipeBuilder()
                .input(ingot, GTEMaterials.Infinity, 9)
                .output(block, GTEMaterials.Infinity)
                .duration(300).EUt(2)
                .buildAndRegister();
    }
}
