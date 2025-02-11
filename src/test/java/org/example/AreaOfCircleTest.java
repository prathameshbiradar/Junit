package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfCircleTest {

    @Test
    void testArea()
    {
        AreaOfCircle area = new AreaOfCircle();
        assertEquals(314.1592653589793,area.areaOfCircle(10),"method should return area of circle");
    }
    @Test
    void testArea2()
    {
        AreaOfCircle area1 = new AreaOfCircle();
        assertEquals(78.53,area1.areaOfCircle(5),"Method should return area of circle");
    }
}