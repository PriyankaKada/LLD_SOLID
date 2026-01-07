package com.scaler.lld.bird.v3;

import com.scaler.lld.bird.v0.BirdType;
import com.scaler.lld.bird.v0.Colour;
import com.scaler.lld.bird.v0.Size;

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
