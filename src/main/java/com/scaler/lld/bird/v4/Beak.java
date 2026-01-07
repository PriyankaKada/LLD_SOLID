package com.scaler.lld.bird.v4;

import lombok.Getter;

@Getter
public abstract class Beak {
    private double strength;
    private String material;

    public Beak(double strength, String material) {
        this.strength = strength;
        this.material = material;
    }
}
