package com.scaler.lld.design_patterns.factory.simplefactory;

import lombok.AllArgsConstructor;
// Create Implementation Product class
public class RoundBtn extends Button {
    private Double radius;

    public RoundBtn(Double border, Double radius) {
        super(border);
        this.radius = radius;
    }

    @Override
    public void onClick(){
        System.out.println("Round Button clicked....");
    }
    @Override
    public  void render(){
        System.out.println("Round Button rendered.. ");
    }
}
