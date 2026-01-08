package com.scaler.lld.design_patterns.prototype.game;

//Step 1: Create Clonable interface
@FunctionalInterface
public interface GraphicalObject {

    GraphicalObject clone();
}
