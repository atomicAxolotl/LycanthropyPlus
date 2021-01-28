package com.atomicaxolotl.lycanthropy.client;

import com.atomicaxolotl.lycanthropy.items.SpawnEggBase;
import com.atomicaxolotl.lycanthropy.util.animation.IAnimatable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.settings.PointOfView;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.ArrayList;
import java.util.List;

/**
 * EventBus listeners on CLIENT distribution
 * Also a client helper class because yes.
 */
@SuppressWarnings("unused")
public class ClientEvents
{
    public static final List<Runnable> CALLBACKS = new ArrayList<>();

    public static void load()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        bus.addListener(ClientEvents::clientSetup);
        bus.addListener(ClientEvents::itemColors);

    }

    public static void clientSetup(final FMLClientSetupEvent event)
    {
        CALLBACKS.forEach(Runnable::run);
        CALLBACKS.clear();
    }


    public static void itemColors(ColorHandlerEvent.Item evt)
    {
        ItemColors handler = evt.getItemColors();
        IItemColor func = (stack, tintIndex) -> ((SpawnEggBase) stack.getItem()).getColor(tintIndex);
        for (SpawnEggBase e : SpawnEggBase.SPAWN_EGGS) handler.register(func, e);
    }


    public static Minecraft getClient()
    {
        return Minecraft.getInstance();
    }

    public static ClientWorld getWorld()
    {
        return getClient().world;
    }

    public static PlayerEntity getPlayer()
    {
        return getClient().player;
    }

    public static Vector3d getProjectedView()
    {
        return getClient().gameRenderer.getActiveRenderInfo().getProjectedView();
    }

    public static float getPartialTicks()
    {
        return getClient().getRenderPartialTicks();
    }

    public static boolean handleAnimationPacket(int entityID, int animationIndex)
    {
        World world = ClientEvents.getWorld();
        IAnimatable entity = (IAnimatable) world.getEntityByID(entityID);

        if (animationIndex < 0) entity.setAnimation(IAnimatable.NO_ANIMATION);
        else entity.setAnimation(entity.getAnimations()[animationIndex]);
        return true;
    }
}
