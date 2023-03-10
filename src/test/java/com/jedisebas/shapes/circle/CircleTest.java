package com.jedisebas.shapes.circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void givenRadius_whenCalculateArea_thenReturnArea() {
        Circle circle = new Circle(4);
        double area = Math.PI * 4 * 4;
        assertEquals(area, circle.area());
    }

    @Test
    void givenZero_whenCalculateCircumference_thenReturnZero() {
        Circle circle = new Circle(0);
        assertEquals(0.0, circle.circumference());
    }

    @Test
    void givenCircle_whenToString_thenReturnTrue() {
        Circle circle = new Circle(1);
        assertEquals("Circle(radius=1.0)", circle.toString());
    }
}
