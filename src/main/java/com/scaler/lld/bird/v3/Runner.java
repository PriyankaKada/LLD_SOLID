package com.scaler.lld.bird.v3;

import com.scaler.lld.bird.v0.BirdType;
import com.scaler.lld.bird.v0.Colour;
import com.scaler.lld.bird.v0.Size;
import com.scaler.lld.bird.v3.Sparrow;
import com.scaler.lld.bird.v3.Eagle;
import com.scaler.lld.bird.v3.Penguin;

import java.util.List;


public class Runner {
    public static void main(String[] args){

        Flyable eagle= new Eagle("Eagle 1",2.0d, BirdType.EAGLE, Size.LARGE, Colour.BLUE);

        eagle.fly();
        Flyable sparrow= new Sparrow("Eagle 1",2.0d, BirdType.EAGLE, Size.LARGE, Colour.BLUE);

        sparrow.fly();

        com.scaler.lld.bird.v3.Swimable p = new Penguin("Penguin 1",2.0d, BirdType.PENGUIN, Size.LARGE, Colour.GREEN);
        p.swim();
        flyAllBirds(List.of(eagle,sparrow));
    }
    public static void flyAllBirds(List<Flyable> flyableList){
        flyableList.forEach(Flyable::fly);
    }
}
