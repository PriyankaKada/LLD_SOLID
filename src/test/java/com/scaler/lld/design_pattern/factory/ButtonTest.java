package com.scaler.lld.design_pattern.factory;

import com.scaler.lld.design_patterns.factory.factorymethod.RoundButtonFactory;
import com.scaler.lld.design_patterns.factory.simplefactory.*;
import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertTrue;

public class ButtonTest {
    @Test
    public void testRoundButton(){

        Button button = ButtonFactory.createButton(ScreenSize.MOBILE,10d,10d,null);

        assert (button instanceof RoundBtn);
    }

    @Test
    public void testSquareButton(){

        Button button = ButtonFactory.createButton(ScreenSize.TABLET,10d,null,10d);

        assert (button instanceof SquareButton);
    }


}
