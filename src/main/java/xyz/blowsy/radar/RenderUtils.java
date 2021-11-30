package xyz.blowsy.radar;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class RenderUtils {

    public static final int rectColor = new Color(0, 0, 0, 125).getRGB();

    public static void draw2DPolygon(double x, double y, double radius, int sides, int color) {
        if (sides < 3) return;
        float a = (color >> 24 & 0xFF) / 255.0F;
        float r = (color >> 16 & 0xFF) / 255.0F;
        float g = (color >> 8 & 0xFF) / 255.0F;
        float b = (color & 0xFF) / 255.0F;
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldrenderer = tessellator.getWorldRenderer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GL11.glColor4f(r, g, b, a);
        worldrenderer.begin(GL11.GL_TRIANGLE_FAN, DefaultVertexFormats.POSITION);
        for (int i = 0; i < sides; i++) {
            double angle = (Math.PI * 2 * i / sides) + Math.toRadians(180);
            worldrenderer.pos(x + Math.sin(angle) * radius, y + Math.cos(angle) * radius, 0).endVertex();
        }
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

}
