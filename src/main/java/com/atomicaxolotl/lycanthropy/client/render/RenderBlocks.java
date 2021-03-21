package com.atomicaxolotl.lycanthropy.client.render;

import com.atomicaxolotl.lycanthropy.setup.Registration;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class RenderBlocks {

    public void setRenderType (FMLClientSetupEvent event) {
            RenderType renderType = RenderType.getCutout();
            RenderTypeLookup.setRenderLayer(Registration.WOLFSBANE.get(), renderType);
    };

}
