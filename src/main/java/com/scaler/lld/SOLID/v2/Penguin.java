package com.scaler.lld.SOLID.v2;

import com.scaler.lld.SOLID.v0.BirdType;
import com.scaler.lld.SOLID.v0.Colour;
import com.scaler.lld.SOLID.v0.Size;

public class Penguin extends NonFlyableBird{
    public Penguin(String name, Double weight, BirdType type, Size size, Colour colour) {
        super(name, weight, type, size, colour);
    }

    @Override
    void swim() {
        System.out.println("Penguin is swimming..");
    }
}
