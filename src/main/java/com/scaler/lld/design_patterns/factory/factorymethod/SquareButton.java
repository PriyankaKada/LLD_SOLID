package com.scaler.lld.design_patterns.factory.factorymethod;


public class SquareButton extends Button {
    private Double length;

    public SquareButton(Double border,Double length) {
        super(border);
        this.length = length;
    }

    @Override
    public void onClick(){
        System.out.println("square Button clicked....");
    }
    @Override
    public  void render(){
        System.out.println("Square Button rendered.. ");
    }
}