package com.scaler.lld.SOLID.v4;

import com.scaler.lld.SOLID.v0.BirdType;
import com.scaler.lld.SOLID.v0.Colour;
import com.scaler.lld.SOLID.v0.Size;
import lombok.Getter;

@Getter
abstract class BirdV4 {
    private String name;
    private Double weight;
    private BirdType type;
    private Size size;
    private Colour colour;
    private Beak beak;
//    private StrongBeak break
    /**
     * Instead of adding High level class if I add reference to Low level class our
     * implementation is not generic what if for eagle today we have Weak Beak but tomorrow we can have
     * Weak Beak so better to keep parent reference
     *
     * **/

    public BirdV4(String name, Double weight, BirdType type, Size size, Colour colour, Beak beak) {
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.size = size;
        this.colour = colour;
        this.beak = beak;
    }

    public void eat(){
        System.out.println("I am hungry...");
    }
    public void sleep(){
        System.out.println("I am sleepy...");
    }
}
