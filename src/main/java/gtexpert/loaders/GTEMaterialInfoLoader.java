package gtexpert.loaders;

import gregtech.api.GTValues;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;

import gtexpert.api.GTEValues;
import gtexpert.api.unification.material.GTEMaterials;
import gtexpert.common.GTEMetaBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static gtexpert.api.util.GTEUtility.getModItem;
import static gtexpert.common.GTEBlockMetalCasing.MetalCasingType.*;

public class GTEMaterialInfoLoader {

    public static void init() {
        OreDictUnifier.registerOre(GTEMetaBlocks.GTE_BLOCK_METAL_CASING.getItemVariant(SAWMill),
                new ItemMaterialInfo(new MaterialStack(Materials.TreatedWood, (GTValues.M * 8))));

        OreDictUnifier.registerOre(new ItemStack(Blocks.SOUL_SAND), OrePrefix.dust, GTEMaterials.SoulSand);
        OreDictUnifier.registerOre(new ItemStack(Items.CHORUS_FRUIT), OrePrefix.dust, GTEMaterials.ChorusFruit);

        if (GTEValues.isModLoadedDEDA()) {
            OreDictUnifier.registerOre(new ItemStack(Blocks.DRAGON_EGG),
                    new ItemMaterialInfo(new MaterialStack(GTEMaterials.Dragon, (GTValues.M * 8))));
            OreDictUnifier.registerOre(getModItem(GTEValues.MODID_DE, "chaos_shard", 1, 1),
                    new ItemMaterialInfo(new MaterialStack(GTEMaterials.Chaos, 1)));
            OreDictUnifier.registerOre(GTEMetaBlocks.GTE_BLOCK_METAL_CASING.getItemVariant(DRACONIUM_CASING),
                    new ItemMaterialInfo(new MaterialStack(GTEMaterials.Draconium, (GTValues.M * 8))));
            OreDictUnifier.registerOre(GTEMetaBlocks.GTE_BLOCK_METAL_CASING.getItemVariant(AWAKENED_DRACONIUM_CASING),
                    new ItemMaterialInfo(new MaterialStack(GTEMaterials.AwakenedDraconium, GTValues.M * 8)));
        }
    }
}