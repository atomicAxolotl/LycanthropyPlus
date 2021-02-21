package com.atomicaxolotl.lycanthropy.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderFaoladhPlayer extends EntityRenderer{

    private static Minecraft mc = Minecraft.getInstance();

    protected RenderFaoladhPlayer(final EntityRendererManager renderManager) {
        super(renderManager);
    }

    @Override
    public ResourceLocation getEntityTexture(Entity entity) {
        return null;
    }
}
