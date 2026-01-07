package com.scaler.lld.bird.v1;

import com.scaler.lld.bird.BirdType;
import com.scaler.lld.bird.Colour;
import com.scaler.lld.bird.Size;
import lombok.Getter;

@Getter
abstract class  BirdV1 {
    private String name;
    private Double weight;
    private BirdType type;
    private Size size;
    private Colour colour;

    public BirdV1(String name, Double weight, BirdType type, Size size, Colour colour) {
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.size = size;
        this.colour = colour;
    }

    abstract void fly();
    public void eat(){
        System.out.println("I am hungry...");
    }
    public void sleep(){
        System.out.println("I am sleepy...");
    }
}
