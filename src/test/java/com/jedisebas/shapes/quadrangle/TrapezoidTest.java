package com.jedisebas.shapes.quadrangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrapezoidTest {

    @Test
    void givenTrapezoid_whenToString_thenReturnTrue() {
        Trapezoid trapezoid = new Trapezoid(1, 2, 3, 4, 5);
        assertEquals("Trapezoid(sideA=1.0, sideB=2.0, sideC=3.0, sideD=4.0, heightA=5.0)", trapezoid.toString());
    }
}
