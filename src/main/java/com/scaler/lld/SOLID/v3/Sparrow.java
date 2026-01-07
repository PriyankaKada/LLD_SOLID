package com.scaler.lld.SOLID.v3;

import com.scaler.lld.SOLID.v0.BirdType;
import com.scaler.lld.SOLID.v0.Colour;
import com.scaler.lld.SOLID.v0.Size;

public class Sparrow implements Flyable {
    public Sparrow(String name, Double weight, BirdType type,
                   Size size,
                   Colour colour) {
        super();
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");

    }

}
