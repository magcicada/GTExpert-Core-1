package gtexpert.integration.ae;

import appeng.api.AEApi;
import appeng.api.definitions.IBlocks;
import appeng.api.definitions.IItems;
import appeng.api.definitions.IMaterials;
import appeng.api.definitions.IParts;
import net.minecraft.item.ItemStack;

public class AEHelper {
    public static IItems aeItems = AEApi.instance().definitions().items();
    public static IBlocks aeBlocks = AEApi.instance().definitions().blocks();
    public static IMaterials aeMaterials = AEApi.instance().definitions().materials();
    public static IParts aeParts = AEApi.instance().definitions().parts();

    public static void addInscriberRecipe(ItemStack stack) {}

    public static void removeInscriberRecipe(ItemStack stack) {}
}
