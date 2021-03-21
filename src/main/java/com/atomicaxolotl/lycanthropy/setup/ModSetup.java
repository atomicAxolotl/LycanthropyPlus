package com.atomicaxolotl.lycanthropy.setup;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import com.atomicaxolotl.lycanthropy.commands.ModCommands;
import com.atomicaxolotl.lycanthropy.dimension.BiomeProvider;
import com.atomicaxolotl.lycanthropy.dimension.ChunkGenerator;
import com.atomicaxolotl.lycanthropy.entities.FaoladhMobEntity;
import com.atomicaxolotl.lycanthropy.network.Networking;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Lycanthropy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static final ItemGroup ITEM_GROUP = new ItemGroup("lycanthropy") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.SILVER_INGOT.get());
        }
    };

    public static void init(final FMLCommonSetupEvent event) {
        Networking.registerMessages();


        event.enqueueWork(() -> {
            GlobalEntityTypeAttributes.put(Registration.WEREWOLF.get(), FaoladhMobEntity.prepareAttributes().create());

            Registry.register(Registry.CHUNK_GENERATOR_CODEC, new ResourceLocation(Lycanthropy.MOD_ID, "chunkgen"),
                    ChunkGenerator.CODEC);
            Registry.register(Registry.BIOME_PROVIDER_CODEC, new ResourceLocation(Lycanthropy.MOD_ID, "biomes"),
                    BiomeProvider.CODEC);
        });
    }

    @SubscribeEvent
    public static void serverLoad(RegisterCommandsEvent event) {
        ModCommands.register(event.getDispatcher());
    }
}
