package gtexpert.client;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

import static gregtech.client.renderer.texture.cube.OrientedOverlayRenderer.OverlayFace.FRONT;

@Mod.EventBusSubscriber(modid = "gtexpert", value = Side.CLIENT)
public class GTETextures {

    public static SimpleOverlayRenderer SAWMILL_CASING;
    public static OrientedOverlayRenderer SAWMILL_OVERLAY;

    public static void preInit() {
        SAWMILL_CASING = new SimpleOverlayRenderer("sawmill_casing");
        SAWMILL_OVERLAY = new OrientedOverlayRenderer("sawmill", FRONT);
    }
}
