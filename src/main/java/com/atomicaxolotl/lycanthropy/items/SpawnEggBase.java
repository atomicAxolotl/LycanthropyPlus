package com.atomicaxolotl.lycanthropy.items;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import com.atomicaxolotl.lycanthropy.util.RegistryHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class SpawnEggBase extends SpawnEggItem {
    public static final Set<SpawnEggBase> SPAWN_EGGS = new HashSet<>();

    public final Lazy<EntityType<?>> type;

    @SuppressWarnings("ConstantConditions")
    public SpawnEggBase(Supplier<EntityType<? extends Entity>> type, int primaryColor, int secondaryColor) {
        super(null, primaryColor, secondaryColor, RegistryHandler.builder());

        this.type = Lazy.of(type);
        SPAWN_EGGS.add(this);
    }

    @Override
    public ITextComponent getDisplayName(ItemStack stack) {
        ResourceLocation regName = type.get().getRegistryName();
        return new TranslationTextComponent("entity." + regName.getNamespace() + "." + regName.getPath())
                .appendString(" ")
                .append(new TranslationTextComponent("item.lycanthropy.spawn_egg"));
    }

    public EntityType<?> getType(@Nullable CompoundNBT tag) {
        if (tag != null && tag.contains("EntityTag", 10)) {
            CompoundNBT childTag = tag.getCompound("EntityTag");
            if (childTag.contains("id", 8))
                return EntityType.byKey(childTag.getString("id")).orElse(type.get());
        }

        return type.get();
    }

}
