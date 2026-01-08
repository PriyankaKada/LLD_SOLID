package com.scaler.lld.design_patterns.prototype.game;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@NoArgsConstructor
@Setter
// Step 2 --> Implement Clonable Interface
@Getter
public class BackgroundObject implements GraphicalObject{
    private Double x;
    private Double y;

    private Double width;
    private  Double height;
    private BackGroundType type;
    @Setter(AccessLevel.NONE)// Do not create the setter
    @Getter(AccessLevel.NONE)
    private List<Double> pixels = new ArrayList<>();

    public BackgroundObject(Double x, Double y, Double width, Double height, BackGroundType type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
        this.pixels = generatePixels();
    }

    private List<Double> generatePixels() {
        return Collections.emptyList();
    }
    //Copy Constructor
    public BackgroundObject(BackgroundObject backgroundObject){
        this.x = backgroundObject.x;
        this.y = backgroundObject.y;
        this.width = backgroundObject.width;
        this.height = backgroundObject.height;
        this.type = backgroundObject.type;
        // generate pixel method is not called again we are just copying values from
        // background object
        this.pixels = backgroundObject.pixels;
    }
    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(this);
    }
}
