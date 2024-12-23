package com.skosarev.lab03.part8.task4;

public class Point {
    protected long x;
    protected long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public void setX(long x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{%d;%d}".formatted(this.x, this.y);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        return new Point(this.x, this.y);
    }
}