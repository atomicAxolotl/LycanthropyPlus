package com.atomicaxolotl.lycanthropy;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.MixinEnvironment;

public class LycanCapability implements ILycanCapability {

    private boolean moonTransformation = false;

    @Override
    public boolean isWerewolf() {
        return this.isWerewolf();
    }

    @Override
    public boolean isFaoladh() {
        return this.isFaoladh();
    }

    @Override
    public boolean isShifted() {
        return this.isShifted();
    }

    @Override
    public boolean isSprinting() {
        return this.isSprinting();
    }

    @Override
    public boolean getMoonTransformation() {
        return this.moonTransformation;
    }

    @Override
    public void setMoonTransformation(boolean state) {
        this.moonTransformation = state;
    }

    @Override
    public void setWerewolf(boolean state) {
        this.isWerewolf();

    }

    @Override
    public void setWerewolf(boolean var1, PlayerEntity var2) {

    }

    @Override
    public void setShifted(boolean var1) {

    }

    @Override
    public void setSprinting(boolean var1) {

    }

    @Override
    public void copy(ILycanCapability var1) {

    }

    @Override
    public void setInfected() {

    }

    @Override
    public void setTransformed(boolean var1, boolean var2, MixinEnvironment.Side var3, PlayerEntity var4) {

    }

    @Override
    public void setTransformedServer(boolean var1, PlayerEntity var2) {

    }

    @Override
    public void tryTransform(PlayerEntity var1) {

    }

    @Override
    public void setModel(int var1) {

    }

    @Override
    public void setModel(int var1, MixinEnvironment.Side var2, PlayerEntity var3) {

    }

    @Override
    public void setTexture(int var1) {

    }

    @Override
    public void setTexture(int var1, MixinEnvironment.Side var2, PlayerEntity var3) {

    }

    @Override
    public int getInfected() {
        return 0;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getLevelCap() {
        return 0;
    }

    @Override
    public int getExp() {
        return 0;
    }

    @Override
    public int getModel() {
        return 0;
    }

    @Override
    public int getTexture() {
        return 0;
    }

    @Override
    public String getModelName() {
        return null;
    }

    @Override
    public String getTextureName() {
        return null;
    }
}
