package com.scaler.lld.design_pattern;

import com.scaler.lld.design_patterns.singleton.LogWritter;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Logger {

    @Test
    public void testConstructor(){
        LogWritter logger = LogWritter.getINSTANCE();
        assertNotNull( logger);
    }

    @Test
    public void testSingleInstance(){
        LogWritter logWritter =LogWritter.getINSTANCE();
        LogWritter logWritter2 =LogWritter.getINSTANCE();

        assertEquals(logWritter,logWritter2);
    }
}
