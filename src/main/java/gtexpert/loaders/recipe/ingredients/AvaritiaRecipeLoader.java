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
        ModHandler.addMirroredShapedRecipe("avaritia_neutronium_dust", new ItemStack(ModItems.resource, 1, 2),
                "D", 'D', OreDictUnifier.get(dustTiny, Materials.Neutronium));
        ModHandler.addMirroredShapedRecipe("ceu_neutronium_dust", OreDictUnifier.get(dustTiny, Materials.Neutronium),
                "D", 'D', new ItemStack(ModItems.resource, 1, 2));
        ModHandler.removeRecipeByOutput(new ItemStack(ModItems.resource, 9, 2));

        // Nugget
        ModHandler.removeRecipeByOutput(new ItemStack(ModItems.resource, 1, 3));
        ModHandler.removeRecipeByOutput(new ItemStack(ModItems.resource, 9, 3));

        // Ingot
        ModHandler.removeRecipeByName(
                new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/un_neutronium_block"));
        ModHandler.addMirroredShapedRecipe("avaritia_neutronium_ingot", new ItemStack(ModItems.resource, 1, 4),
                "I", 'I', OreDictUnifier.get(ingot, Materials.Neutronium));
        ModHandler.addMirroredShapedRecipe("ceu_neutronium_block", OreDictUnifier.get(ingot, Materials.Neutronium),
                "I", 'I', new ItemStack(ModItems.resource, 1, 4));

        // Block
        ModHandler
                .removeRecipeByName(new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/neutronium_block"));
        ModHandler.addMirroredShapedRecipe("avaritia_neutronium_ingot", new ItemStack(ModBlocks.resource, 1, 0),
                "B", 'B', OreDictUnifier.get(block, Materials.Neutronium));
        ModHandler.addMirroredShapedRecipe("ceu_neutronium_block", OreDictUnifier.get(block, Materials.Neutronium),
                "B", 'B', new ItemStack(ModBlocks.resource, 1, 0));
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
        // ModHandler.addMirroredShapedRecipe("avaritia_crystal_matrix_ingot", new ItemStack(ModItems.resource, 1, 1),
        // "I", 'I', OreDictUnifier.get(ingot, GTEMaterials.Infinity));
        // ModHandler.addMirroredShapedRecipe("ceu_crystal_matrix_block", OreDictUnifier.get(ingot,
        // GTEMaterials.Infinity),
        // "I", 'I', new ItemStack(ModItems.resource, 1, 1));

        // Block
        ModHandler.removeRecipeByName(
                new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/crystal_matrix_block"));
        // ModHandler.addMirroredShapedRecipe("avaritia_crystal_matrix_ingot", new ItemStack(ModBlocks.resource, 1, 2),
        // "B", 'B', OreDictUnifier.get(block, GTEMaterials.CrystalMatrix));
        // ModHandler.addMirroredShapedRecipe("ceu_crystal_matrix_block", OreDictUnifier.get(block,
        // GTEMaterials.CrystalMatrix),
        // "B", 'B', new ItemStack(ModBlocks.resource, 1, 2));
        RecipeMaps.COMPRESSOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(ModItems.resource, 9, 1))
                .outputs(new ItemStack(ModBlocks.resource, 1, 2))
                .duration(300).EUt(2)
                .buildAndRegister();
        RecipeMaps.ALLOY_SMELTER_RECIPES.recipeBuilder()
                .notConsumable(MetaItems.SHAPE_MOLD_INGOT)
                .inputs(new ItemStack(ModBlocks.resource, 1, 2))
                .outputs(new ItemStack(ModItems.resource, 9, 1))
                .duration(4000).EUt(7)
                .buildAndRegister();

        // ########################################
        // Infinity
        // ########################################
        // Ingot
        ModHandler.removeRecipeByName(
                new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/un_infinity_block"));
        ModHandler.addMirroredShapedRecipe("avaritia_infinity_ingot", new ItemStack(ModItems.resource, 1, 6),
                "I", 'I', OreDictUnifier.get(ingot, GTEMaterials.Infinity));
        ModHandler.addMirroredShapedRecipe("ceu_infinity_block", OreDictUnifier.get(ingot, GTEMaterials.Infinity),
                "I", 'I', new ItemStack(ModItems.resource, 1, 6));

        // Block
        ModHandler.removeRecipeByName(new ResourceLocation(GTEValues.MODID_AVARITIA, "blocks/resource/infinity_block"));
        ModHandler.addMirroredShapedRecipe("avaritia_infinity_ingot", new ItemStack(ModBlocks.resource, 1, 1),
                "B", 'B', OreDictUnifier.get(block, GTEMaterials.Infinity));
        ModHandler.addMirroredShapedRecipe("ceu_infinity_block", OreDictUnifier.get(block, GTEMaterials.Infinity),
                "B", 'B', new ItemStack(ModBlocks.resource, 1, 1));
        RecipeMaps.COMPRESSOR_RECIPES.recipeBuilder()
                .input(ingot, GTEMaterials.Infinity, 9)
                .output(block, GTEMaterials.Infinity)
                .duration(300).EUt(2)
                .buildAndRegister();
    }
}