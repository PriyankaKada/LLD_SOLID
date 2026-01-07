package com.scaler.lld.bird.v3;

import com.scaler.lld.bird.v0.BirdType;
import com.scaler.lld.bird.v0.Colour;
import com.scaler.lld.bird.v0.Size;
import com.scaler.lld.bird.v2.NonFlyableBird;

public class Penguin extends BirdV3 implements Swimable {
    public Penguin(String name, Double weight, BirdType type, Size size, Colour colour) {
        super(name, weight, type, size, colour);
    }


    @Override
    public void swim() {
        System.out.println("Penguin is swimming..");
    }
}
