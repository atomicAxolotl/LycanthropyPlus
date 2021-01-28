package com.atomicaxolotl.lycanthropy.util;


import com.atomicaxolotl.lycanthropy.Lycanthropy;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WereSounds
{
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Lycanthropy.MOD_ID);

    public static final RegistryObject<SoundEvent> WEREWOLF_GROWL = register("werewolf.growl");
    public static final RegistryObject<SoundEvent> WEREWOLF_SNIFF = register("werewolf.sniff");


    public static RegistryObject<SoundEvent> register(String name)
    {
        return REGISTRY.register(name, () -> new SoundEvent(Lycanthropy.rl(name)));
    }

    public static RegistryObject<SoundEvent> entity(String name)
    {
        return register("entity." + name);
    }
}
