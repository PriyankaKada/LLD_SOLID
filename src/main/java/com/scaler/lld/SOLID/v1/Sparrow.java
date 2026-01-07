package com.scaler.lld.SOLID.v1;

import com.scaler.lld.SOLID.v0.BirdType;
import com.scaler.lld.SOLID.v0.Colour;
import com.scaler.lld.SOLID.v0.Size;

public class Sparrow extends BirdV1{
    public Sparrow(String name,Double weight, BirdType type,
     Size size,
     Colour colour) {
        super(name,weight,type,size,colour);
    }

    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }
}
