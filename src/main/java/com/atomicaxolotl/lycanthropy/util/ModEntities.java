package com.atomicaxolotl.lycanthropy.util;

import com.atomicaxolotl.lycanthropy.Lycanthropy;


import com.atomicaxolotl.lycanthropy.entities.FaoladhEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Lycanthropy.MOD_ID);

//TODO ::new gives an error "Incompatible types: EntityType<Entity> is not convertible to EntityType<? extends FaoladhEntity>"
//gotta figure that out grrr
    public static final RegistryObject<EntityType<FaoladhEntity>> FAOLADH = ENTITIES.register("faoladh",
            () -> EntityType.Builder.create(FaoladhEntity::new, EntityClassification.CREATURE))
            .size(1.0f, 2.6f)
            .build(new ResourceLocation(Lycanthropy.MOD_ID, "faoladh").toString());

}



