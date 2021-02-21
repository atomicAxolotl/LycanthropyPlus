package com.atomicaxolotl.lycanthropy;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.MixinEnvironment;

import java.util.HashMap;

public class LycanCapability implements ILycanCapability {

    private boolean moonTransformation = false;
    private boolean isWerewolf;
    private int infected;
    private int model;
    private int texture;
    private boolean isShifted;
    private HashMap<String, Boolean> starterTree;


    public LycanCapability() {
        this.infected = 0;
        this.isWerewolf = false;
        this.isShifted = false;
        this.model = 0;
        this.texture = 0;
        this.starterTree = new HashMap<String, Boolean>() {
            {
                for (final LycanBasic basic : LycanList.BASIC){
                    this.put(basic.getKey(), false);
                }
            }
        };
    }

    @Override
    public void copy(final ILycanCapability cap) {
        this.infected = cap.getInfected();
        this.isShifted = cap.isShifted();
        this.isWerewolf = cap.isWerewolf();
        this.model = cap.getModel();
        this.texture = cap.getTexture();

    }

    @Override
    public boolean isWerewolf() {
        return this.isWerewolf;
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
    public void setMoonTransformation(final boolean state) {
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
    public void setInfected(final int f) { this.infected = f; }

    @Override
    public void setTransformed(boolean var1, boolean var2, MixinEnvironment.Side var3, PlayerEntity var4) {

    }

    @Override
    public void setTransformedServer(boolean var1, PlayerEntity var2) {

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
        return this.infected;
    }

    @Override
    public int getModel() {
        return this.model;
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
