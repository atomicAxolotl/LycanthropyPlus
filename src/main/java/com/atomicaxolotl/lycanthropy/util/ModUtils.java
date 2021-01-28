package com.atomicaxolotl.lycanthropy.util;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistryEntry;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class ModUtils
{
    private ModUtils()
    {
    }

    public static <T extends IForgeRegistryEntry<T>> Block getRegistryEntries(DeferredRegister<T> registry)
    {
        ImmutableSet.Builder<T> entries = ImmutableSet.builder();
        for (RegistryObject<T> entry : registry.getEntries()) entries.add(entry.get());
        return entries.build();
    }

    @Nullable
    public static ItemStack getHeldStack(PlayerEntity player, Item item)
    {
        ItemStack main = player.getHeldItemMainhand();
        ItemStack off = player.getHeldItemOffhand();
        return item == main.getItem()? main : item == off.getItem()? off : null;
    }

    @Nullable
    public static <T extends Entity> EntityType<T> getEntityTypeByKey(@Nonnull String key)
    {
        return (EntityType<T>) EntityType.byKey(key).orElse(null);
    }

    public static void playLocalSound(World world, BlockPos pos, SoundEvent sound, float volume, float pitch)
    {
        world.playSound(pos.getX(), pos.getY(), pos.getZ(), sound, SoundCategory.NEUTRAL, volume, pitch, false);
    }

    public static Iterable<BlockPos> getBlockPosesInAABB(AxisAlignedBB aabb)
    {
        return BlockPos.getAllInBoxMutable(
                MathHelper.floor(aabb.minX),
                MathHelper.floor(aabb.minY),
                MathHelper.floor(aabb.minZ),
                MathHelper.ceil(aabb.maxX),
                MathHelper.ceil(aabb.maxY),
                MathHelper.ceil(aabb.maxZ));
    }

    @SafeVarargs
    public static <T> boolean equalsAny(T comparator, T... comparing)
    {
        for (T t : comparing) if (comparator.equals(t)) return true;
        return false;
    }
}
