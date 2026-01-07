package com.scaler.lld.SOLID.v2;

import com.scaler.lld.SOLID.v0.BirdType;
import com.scaler.lld.SOLID.v0.Colour;
import com.scaler.lld.SOLID.v0.Size;

public abstract class NonFlyableBird extends BirdV2 {
    public NonFlyableBird(String name, Double weight, BirdType type, Size size, Colour colour) {
        super(name, weight, type, size, colour);
    }

    abstract void  swim();
}
