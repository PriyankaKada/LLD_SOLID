package com.scaler.lld.bird.v1;

import com.scaler.lld.bird.BirdType;
import com.scaler.lld.bird.Colour;
import com.scaler.lld.bird.Size;

public class Runner {
    public static void main(String[] args){

        Eagle eagle= new Eagle("Eagle 1",2.0d, BirdType.EAGLE, Size.LARGE, Colour.BLUE);
        eagle.fly();
        Sparrow sparrow = new Sparrow("Sparrow 1",1.0d, BirdType.SPARROW, Size.SMALL, Colour.BLUE);
        sparrow.fly();
    }
}
