package com.scaler.lld.design_pattern.prototype_registery;

import com.scaler.lld.design_patterns.prototype.game.BackGroundType;
import com.scaler.lld.design_patterns.prototype.game.BackgroundObject;
import org.junit.jupiter.api.Test;

import java.rmi.registry.Registry;

import static org.junit.jupiter.api.Assertions.*;

public class BackgroundObjectTest {

    @Test
    public void testClone(){
        // Step 3 Create Prototype +clone it+modify it

        BackgroundObject backgroundObject = new BackgroundObject(0.0d,0.0d,10.0d,10.0d, BackGroundType.TREE);
        BackgroundObject tree= backgroundObject.clone();
        assertNotEquals(backgroundObject,tree);
        assertEquals(tree.getType(), backgroundObject.getType());

        // Modify

        tree.setX(15.0);
        tree.setY(70.8);


    }

    @Test
    public void testRegistery(){
        //Create Prototype
        BackgroundObject backgroundObject = new BackgroundObject(10.0,10.0,10.0,10.0,BackGroundType.TREE);


        //Add prototype to Registery
        BackgroundObjectRegistry registry = new BackgroundObjectRegistry() ;
        registry.addPrototype(backgroundObject);
        // get prototype from registery

        BackgroundObject object= registry.getPrototype(BackGroundType.TREE);
        BackgroundObject objectPerson= registry.getPrototype(BackGroundType.PERSON);

        assertNotNull(object);
        assertNull(objectPerson);
    }
}
