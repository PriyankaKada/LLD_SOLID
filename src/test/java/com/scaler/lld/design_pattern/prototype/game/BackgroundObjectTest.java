package com.scaler.lld.design_pattern.prototype.game;

import com.scaler.lld.design_patterns.prototype.game.BackGroundType;
import com.scaler.lld.design_patterns.prototype.game.BackgroundObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
}
