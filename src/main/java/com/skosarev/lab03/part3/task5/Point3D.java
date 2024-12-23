package com.skosarev.lab03.part3.task5;

import com.skosarev.lab02.part1.task1.Point;

// Точка в пространстве
public class Point3D extends Point {
    private long z;

    public Point3D(long x, long y, long z) {
        super(x, y);
        this.z = z;
    }

    public long getZ() {
        return z;
    }

    public void setZ(long z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "{%d;%d;%d}".formatted(this.x, this.y, this.z);
    }
}
