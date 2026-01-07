package com.scaler.lld.SOLID.v2;

import com.scaler.lld.SOLID.v0.BirdType;
import com.scaler.lld.SOLID.v0.Colour;
import com.scaler.lld.SOLID.v0.Size;

public abstract class FlayableBird extends BirdV2 {

    public FlayableBird(String name, Double weight, BirdType type, Size size, Colour colour) {
        super(name, weight, type, size, colour);
    }

    abstract void fly();
}
