package com.atomicaxolotl.lycanthropy.items;

import com.atomicaxolotl.lycanthropy.setup.ModSetup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class OddMeat extends Item {
    public OddMeat() {
        super(new Item.Properties()
                .group(ModSetup.ITEM_GROUP)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(1.3f)
                        .effect(new EffectInstance(Effects.NAUSEA, 200, 1), 1)
                        .effect(new EffectInstance(Effects.POISON, 300, 1), 1)
                        .meat()
                        .setAlwaysEdible()
                        .build())


        );
    }
}
