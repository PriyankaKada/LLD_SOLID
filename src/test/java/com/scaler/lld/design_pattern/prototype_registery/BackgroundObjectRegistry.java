package com.scaler.lld.design_pattern.prototype_registery;

import com.scaler.lld.design_patterns.prototype.game.BackGroundType;
import com.scaler.lld.design_patterns.prototype.game.BackgroundObject;

import java.util.HashMap;
import java.util.Map;

public class BackgroundObjectRegistry {

    private Map<BackGroundType,BackgroundObject> registery = new HashMap<>();
    public void addPrototype(BackgroundObject backgroundObject){
        registery.put(backgroundObject.getType(),backgroundObject);
    }

    public void removePrototype(BackGroundType backGroundType){
        if(registery.containsKey(backGroundType)){
            registery.remove(backGroundType);
        }
    }
    public BackgroundObject getPrototype(BackGroundType backGroundType){
        if(registery.containsKey(backGroundType)){
           return registery.get(backGroundType);
        }
        return null;
    }
}
