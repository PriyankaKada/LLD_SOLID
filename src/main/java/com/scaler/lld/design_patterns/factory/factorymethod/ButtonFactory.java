package com.scaler.lld.design_patterns.factory.factorymethod;

public interface ButtonFactory {

    public Button createButton(
                                      Double border, Double radius, Double length);

}
