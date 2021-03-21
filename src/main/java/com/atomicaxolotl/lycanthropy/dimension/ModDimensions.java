package com.atomicaxolotl.lycanthropy.dimension;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;

public class ModDimensions {

    public static final RegistryKey<DimensionType> LYCDIM_TYPE = RegistryKey.getOrCreateKey(Registry.DIMENSION_TYPE_KEY, new ResourceLocation(Lycanthropy.MOD_ID, "lycdim"));
    public static final RegistryKey<World> LYCDIM = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation(Lycanthropy.MOD_ID, "lycdim"));
}
