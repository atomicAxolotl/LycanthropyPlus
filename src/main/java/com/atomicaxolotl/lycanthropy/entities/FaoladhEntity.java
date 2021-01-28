package com.atomicaxolotl.lycanthropy.entities;

import net.minecraft.entity.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistryEntry;

import javax.annotation.Nullable;

//TODO finish this nonsense at least a lil bit

public class FaoladhEntity<T> extends CreatureEntity implements IForgeRegistryEntry<FaoladhEntity> {

    private int lycanTimer;
    public FaoladhEntity(EntityType<? extends FaoladhEntity> type, World world) {
        super(type, world);

    }

    @Override
    public FaoladhEntity setRegistryName(ResourceLocation name) {
        return null;
    }

    @Nullable
    @Override
    public ResourceLocation getRegistryName() {
        return null;
    }

    @Override
    public Class<FaoladhEntity> getRegistryType() {
        return null;
    }
    @Override
    public void livingTick() {
        if (this.world.isRemote) {
            this.lycanTimer = Math.max(0, this.lycanTimer - 1);

        }
        super.livingTick();
    }
}