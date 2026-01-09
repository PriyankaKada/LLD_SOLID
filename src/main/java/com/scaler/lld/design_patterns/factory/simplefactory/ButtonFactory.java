package com.scaler.lld.design_patterns.factory.simplefactory;

public class ButtonFactory {

    public static Button createButton(ScreenSize screenSize,
                                      Double border,Double radius,Double length){
        return switch (screenSize) {
            case MOBILE, DESKTOP -> new RoundBtn(border, radius);
            case TABLET -> new SquareButton(border, length);
        };
    }
}
