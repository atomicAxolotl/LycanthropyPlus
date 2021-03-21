package com.atomicaxolotl.lycanthropy.client;


import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class KeyHandler {

    private final Minecraft mc;

    public KeyHandler() {
        this.mc = Minecraft.getInstance();
    }

    @SubscribeEvent
    public void handleKeyInputEvent(final InputEvent.KeyInputEvent event) {
        if (this.mc.isGameFocused()) {
            final PlayerEntity player = this.mc.player;

        }
    }
}
