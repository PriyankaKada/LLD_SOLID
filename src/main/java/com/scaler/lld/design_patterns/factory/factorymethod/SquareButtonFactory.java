package com.scaler.lld.design_patterns.factory.factorymethod;

public class SquareButtonFactory implements ButtonFactory{
    @Override
    public Button createButton( Double border, Double radius, Double length) {
        return new SquareButton(border,length);
    }
}
