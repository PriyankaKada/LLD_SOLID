package com.scaler.lld.SOLID.v4;

import com.scaler.lld.SOLID.v0.BirdType;
import com.scaler.lld.SOLID.v0.Colour;
import com.scaler.lld.SOLID.v0.Size;

public class Runner {
    public static void main(String[] args){

        /*As we are referring to parent Beak we are able to add both Strong beak and weak Beak
         * */
        StrongBeak strongBeak = new StrongBeak(10.0,"Calcium");
        com.scaler.lld.SOLID.v4.Eagle eagle= new com.scaler.lld.SOLID.v4.Eagle("Eagle 1",2.0d, BirdType.EAGLE, Size.LARGE, Colour.BLUE,strongBeak);
        WeakBeak weakBeak = new WeakBeak(0.0,"Calcium");
        com.scaler.lld.SOLID.v4.Eagle eagle1= new com.scaler.lld.SOLID.v4.Eagle("Eagle 1",2.0d, BirdType.EAGLE, Size.LARGE, Colour.BLUE,weakBeak);


    }
}
