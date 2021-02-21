package com.atomicaxolotl.lycanthropy;

import net.minecraft.util.ResourceLocation;

public class LycanBasic extends LycanBase {
    private final String key;
    private final ResourceLocation texture;

    public LycanBasic(final String key, final String unlocalizedName, final ResourceLocation texture) {
        super(unlocalizedName);
        this.key = key;
        this.texture = texture;
    }

    public String getKey() { return this.key; }

    public ResourceLocation getTexture() { return this.texture; }
}
