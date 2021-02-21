package com.atomicaxolotl.lycanthropy;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.MixinEnvironment;

public interface ILycanCapability {

    boolean isWerewolf();

    boolean isFaoladh();

    boolean isShifted();

    boolean isSprinting();

    boolean getMoonTransformation();

    void setMoonTransformation(boolean var1);

    void setWerewolf(boolean var1);

    void setWerewolf(boolean var1, PlayerEntity var2);

    void setShifted(boolean var1);

    void setSprinting(boolean var1);

    void copy (ILycanCapability var1);

    void setInfected(final int p0);

    void setTransformed(boolean var1, boolean var2, MixinEnvironment.Side var3, PlayerEntity var4);

    void setTransformedServer(boolean var1, PlayerEntity var2);

    void setModel(int var1);

    void setModel(int var1, MixinEnvironment.Side var2, PlayerEntity var3);

    void setTexture(int var1);

    void setTexture(int var1, MixinEnvironment.Side var2, PlayerEntity var3);

    int getInfected();

    int getModel();

    int getTexture();

    String getModelName();

    String getTextureName();


}
