package com.atomicaxolotl.lycanthropy.util;

import com.atomicaxolotl.lycanthropy.Lycanthropy;


import com.atomicaxolotl.lycanthropy.entities.FaoladhEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Lycanthropy.MOD_ID);

//TODO ::new gives an error "Incompatible types: EntityType<Entity> is not convertible to EntityType<? extends FaoladhEntity>"
//gotta figure that out grrr
public static final RegistryObject<FaoladhEntity> WEREWOLF = ENTITIES.register("werewolf", EntityType.Builder.<FaoladhEntity>create());
}



