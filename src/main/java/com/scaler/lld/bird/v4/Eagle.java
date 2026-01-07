package com.scaler.lld.bird.v4;

import com.scaler.lld.bird.v0.BirdType;
import com.scaler.lld.bird.v0.Colour;
import com.scaler.lld.bird.v0.Size;
import com.scaler.lld.bird.v3.Flyable;

public class Eagle extends BirdV4  {


    /**
     * Instead of adding High level class if I add reference to Low level class our
     * implementation is not generic what if for eagle today we have Weak Beak but tomorrow we can have
     * Weak Beak so better to keep parent reference
     *
     * @param name
     * @param weight
     * @param type
     * @param size
     * @param colour
     * @param beak
     *
     *
     **/
    public Eagle(String name, Double weight, BirdType type, Size size, Colour colour, Beak beak) {
        super(name, weight, type, size, colour, beak);
    }
}
