package com.atomicaxolotl.lycanthropy.world.gen;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import com.atomicaxolotl.lycanthropy.setup.Registration;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class WereWorld
{
    public static List<Consumer<BiomeLoadingEvent>> BIOME_LISTENERS = new ArrayList<>();

    public static void onBiomeLoad(BiomeLoadingEvent evt)
    {
        for (Consumer<BiomeLoadingEvent> e : BIOME_LISTENERS) e.accept(evt);

        BiomeGenerationSettingsBuilder generator = evt.getGeneration();

        switch (evt.getCategory())
        {
            default:
                generator.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.SILVER_ORE_FEATURE);
        }
    }

    public static class Features
    {
        public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, Lycanthropy.MOD_ID);

        public static ConfiguredFeature<?, ?> SILVER_ORE_FEATURE;


        public static void init()
        {
            SILVER_ORE_FEATURE = configure("silver_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.SILVER_ORE.get().getDefaultState(), 9)).range(35).square().func_242731_b(20));
        }

        private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> configure(String id, ConfiguredFeature<FC, ?> cf)
        {
            return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, id, cf);
        }
    }
}
