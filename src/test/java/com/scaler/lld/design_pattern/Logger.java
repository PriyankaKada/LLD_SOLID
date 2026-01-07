package com.scaler.lld.design_pattern;

import com.scaler.lld.design_patterns.LogWritter;
import org.junit.jupiter.api.Test;


import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

public class Logger {

    @Test
    public void testConstructor(){
        LogWritter logger = LogWritter.getINSTANCE();
        assertNotNull("If the constructor was called, a non null object should be created",logger);
    }

    @Test
    public void testSingleInstance(){
        LogWritter logWritter =LogWritter.getINSTANCE();
        LogWritter logWritter2 =LogWritter.getINSTANCE();

        assertEquals("if singleton only one instance is created", logWritter,logWritter2);
    }
}
