package com.atomicaxolotl.lycanthropy.client.render.entity;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import com.atomicaxolotl.lycanthropy.client.model.FaoladhModel;
import com.atomicaxolotl.lycanthropy.entities.FaoladhMobEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderFaoladh extends MobRenderer<FaoladhMobEntity, FaoladhModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Lycanthropy.MOD_ID, "textures/entities/faoladh_darkoak.png");

    public RenderFaoladh(EntityRendererManager manager) {
        super(manager, new FaoladhModel(), 0.8f);
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(FaoladhMobEntity entity) {
        return TEXTURE;
    }
}
