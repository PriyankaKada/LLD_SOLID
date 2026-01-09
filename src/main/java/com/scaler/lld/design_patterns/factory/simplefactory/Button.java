package com.scaler.lld.design_patterns.factory.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;


// Step 1--> Common Product Interface
@AllArgsConstructor
@Getter
public abstract class Button {
    private Double border;
    public  abstract  void onClick();
    public abstract void render();
}
