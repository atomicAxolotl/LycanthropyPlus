package com.atomicaxolotl.lycanthropy.setup;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import com.atomicaxolotl.lycanthropy.client.render.entity.RenderFaoladh;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Lycanthropy.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {

    public static void init(final FMLClientSetupEvent event) {

        RenderingRegistry.registerEntityRenderingHandler(Registration.WEREWOLF.get(), RenderFaoladh::new);

        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(Registration.WOLFSBANE.get(), RenderType.getTranslucent());
        });
    }

    @SubscribeEvent
    public static void onItemColor(ColorHandlerEvent.Item event) {
        event.getItemColors().register((stack, i) -> 0xff0000, Registration.SPAWN_WEREWOLF.get());
    }



    @SubscribeEvent
    public void onTooltipPre(RenderTooltipEvent.Pre event) {
        Item item = event.getStack().getItem();
        if (item.getRegistryName().getNamespace().equals(Lycanthropy.MOD_ID)) {
            event.setMaxWidth(200);
        }
    }
}
