package com.atomicaxolotl.lycanthropy;

import com.atomicaxolotl.lycanthropy.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("lycanthropy")
public class Lycanthropy
{
    public static final ItemGroup ITEM_GROUP = new LycanItemGroup();
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lycanthropy";

    public Lycanthropy() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB = new ItemGroup("lycanthropyTab") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.SILVER_INGOT.get());

        }
    };
    public static ResourceLocation rl(String path) { return new ResourceLocation(MOD_ID, path); }
    static class LycanItemGroup extends ItemGroup
    {
        public LycanItemGroup() { super("lycanthropy"); }

        @Override
        public ItemStack createIcon() { return new ItemStack(RegistryHandler.SILVER_INGOT.get()); }


    }
}
