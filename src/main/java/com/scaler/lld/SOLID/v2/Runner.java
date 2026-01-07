package com.scaler.lld.SOLID.v2;

import com.scaler.lld.SOLID.v0.BirdType;
import com.scaler.lld.SOLID.v0.Colour;
import com.scaler.lld.SOLID.v0.Size;


public class Runner {
    public static void main(String[] args){

        FlayableBird eagle= new Eagle("Eagle 1",2.0d, BirdType.EAGLE, Size.LARGE, Colour.BLUE);

        eagle.fly();

        Penguin p = new Penguin("Penguin 1",2.0d, BirdType.PENGUIN, Size.LARGE, Colour.GREEN);
        p.swim();
    }
}
