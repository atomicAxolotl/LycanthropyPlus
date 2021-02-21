package com.atomicaxolotl.lycanthropy;

import net.minecraft.client.resources.I18n;

public class LycanBase {

    private final String name;
    private final String description;

    public LycanBase(final String unlocalizedName) {
        this.name = unlocalizedName;
        this.description = unlocalizedName + ".desc";
    }
    public String getName() {
        return I18n.format(this.name, new Object[0]);
    }

    public String getDescription() {
        return I18n.format(this.description, new Object[0]);
    }
}
