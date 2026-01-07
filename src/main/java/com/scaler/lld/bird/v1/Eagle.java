package com.scaler.lld.bird.v1;

import com.scaler.lld.bird.BirdType;
import com.scaler.lld.bird.Colour;
import com.scaler.lld.bird.Size;

public class Eagle extends BirdV1{
    public Eagle(String name, Double weight, BirdType type, Size size, Colour colour) {
        super(name, weight, type, size, colour);
    }

    @Override
    void fly() {
        System.out.println("Eagle is flying");
    }
}
