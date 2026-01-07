package com.scaler.lld.bird;

import lombok.Getter;

@Getter
public class Bird {
    private String name;
    private Double weight;
    private  BirdType type;
    private Size size;
    private  Colour colour;
    public void fly(){
        if(this.type == BirdType.EAGLE){
            System.out.println("Eagle is flying");
        } else if (type == BirdType.PARROT) {
            System.out.println("Parrot is flying...");
        }else {
            System.out.println("Bird i s flying....");
        }

    }
    public void eat(){
        System.out.println("I am hungry...");
    }
    public void sleep(){
        System.out.println("I am sleepy...");
    }

}
