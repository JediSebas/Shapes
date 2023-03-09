package com.jedisebas.shapes.quadrangle;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class TrapezoidTest {

    @Test
    void givenEmpty_whenCalculateArea_thenReturnZero() {
        Trapezoid trapezoid = new Trapezoid();
        assertEquals(0.0, trapezoid.area());
    }

    @Test
    void givenTrapezoid_whenToString_thenReturnTrue() {
        Trapezoid trapezoid = new Trapezoid();
        assertEquals("Trapezoid(sideA=0.0, sideB=0.0, sideC=0.0, sideD=0.0, heightA=0.0)", trapezoid.toString());
    }
}
