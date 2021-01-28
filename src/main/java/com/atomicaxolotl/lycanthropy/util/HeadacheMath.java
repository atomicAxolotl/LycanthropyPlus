package com.atomicaxolotl.lycanthropy.util;
//this really does hurt my head...

import net.minecraft.util.math.vector.Vector3d;

public final class HeadacheMath {

    private HeadacheMath() {
    }
    public static final float PI = (float) Math.PI;

    public static Vector3d getYawVec(float yaw, double xOffset, double zOffset) {
        return new Vector3d(xOffset, 0, zOffset).rotateYaw(-yaw * (PI / 180f));
    }

    public static float linTerp(float a, float b, float x)
    {
        if (x <= 0) return a;
        if (x >= 1) return b;
        return a + x * (b - a);
    }
}
