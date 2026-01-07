package com.scaler.lld.bird.v3;

import com.scaler.lld.bird.v0.BirdType;
import com.scaler.lld.bird.v0.Colour;
import com.scaler.lld.bird.v0.Size;

public class Eagle extends BirdV3 implements Flyable {
    public Eagle(String name, Double weight, BirdType type, Size size, Colour colour) {
        super(name, weight, type, size, colour);
    }


    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
