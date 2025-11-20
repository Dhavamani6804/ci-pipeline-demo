package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();
        int result = app.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        App app = new App();
        int result = app.sub(10, 4);
        assertEquals(6, result);
    }
}
