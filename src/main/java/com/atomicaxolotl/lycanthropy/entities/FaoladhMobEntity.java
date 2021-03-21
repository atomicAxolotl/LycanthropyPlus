package com.atomicaxolotl.lycanthropy.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;


public class FaoladhMobEntity extends MonsterEntity {

    public FaoladhMobEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
        super(type, worldIn);
    }


    public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return LivingEntity.registerAttributes()
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 3.0D)
                .createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 40.0D);
    }
}