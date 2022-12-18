package gtexpert.loaders.recipe;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.api.util.GTUtility;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;
import gregicality.multiblocks.api.recipes.GCYMRecipeMaps;
import gregicality.multiblocks.api.unification.properties.GCYMPropertyKey;
import gregicality.multiblocks.api.unification.GCYMMaterials;
import gtexpert.api.recipes.GTERecipeMaps;
import gtexpert.common.GTEBlockMetalCasing;
import gtexpert.common.GTEMetaBlocks;
import gtexpert.common.items.GTEMetaItems;
import gtexpert.common.metatileentities.GTEMetaTileEntities;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gregtech.common.metatileentities.MetaTileEntities.HULL;
import static gtexpert.api.unification.material.GTEMaterials.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;

public class AERecipeLoader {
    public static void init() {
        // Certus Quartz
        // RecipeMaps.EXTRACTOR_RECIPES.findRecipe(30, CertusQuartz).remove(); //TODO: Remove this
        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .input(block, CertusQuartz, 1)
                .fluidOutputs(CertusQuartz.getFluid(576))
                .duration(80).EUt(30)
                .buildAndRegister();
        /*RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .input() // TODO: AE2 Pure Certus Quartz
                .fluidOutputs(CertusQuartz.getFluid(72))
                .duration(20).EUt(30)
                .buildAndRegister();*/

        // Charged Certus Quartz
        RecipeMaps.ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(CertusQuartz.getFluid(144))
                .fluidOutputs(CHARGED_CERTUS_QUARTZ.getFluid(144))
                .duration(100).EUt(480)
                .buildAndRegister();
        /*RecipeMaps.ELECTROLYZER_RECIPES.recipeBuilder()
                .input() // TODO: AE2 Charged Certus Quartz
                .fluidOutputs(CHARGED_CERTUS_QUARTZ.getFluid(144))
                .duration(20).EUt(7)
                .buildAndRegister();*/

        // Fluix
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(Items.REDSTONE, 1)
                .input(dust, NetherQuartz, 1)
                .fluidInputs(CHARGED_CERTUS_QUARTZ.getFluid(144))
                .fluidOutputs(FLUIX.getFluid(144))
                .duration(20).EUt(480)
                .buildAndRegister();
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(Items.REDSTONE, 1)
                .input(dust, CHARGED_CERTUS_QUARTZ, 1)
                .fluidInputs(NetherQuartz.getFluid(144))
                .fluidOutputs(FLUIX.getFluid(144))
                .duration(20).EUt(480)
                .buildAndRegister();
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, NetherQuartz, 1)
                .input(dust, CHARGED_CERTUS_QUARTZ, 1)
                .fluidInputs(Redstone.getFluid(144))
                .fluidOutputs(FLUIX.getFluid(144))
                .duration(20).EUt(480)
                .buildAndRegister();
        /*RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .input(block, Fluix, 1) //TODO: AE2 Pure Fluix Crystal
                .fluidOutputs(FLUIX.getFluid(72))
                .duration(20).EUt(7)
                .buildAndRegister();
        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .input(block, Fluix, 1) //TODO: AE2 Fluix Crystal
                .fluidOutputs(FLUIX.getFluid(144))
                .duration(20).EUt(7)
                .buildAndRegister();
        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .input(block, Fluix, 1) //TODO: AE2 Fluix Block
                .fluidOutputs(FLUIX.getFluid(576))
                .duration(20).EUt(7)
                .buildAndRegister();*/
    }
}
