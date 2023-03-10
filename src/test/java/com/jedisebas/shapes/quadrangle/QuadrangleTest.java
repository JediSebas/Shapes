package com.jedisebas.shapes.quadrangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadrangleTest {

    @Test
    void givenEmpty_whenToString_returnTrue() {
        Quadrangle quadrangle = new Quadrangle();
        assertEquals("Quadrangle(sideA=0.0, sideB=0.0, sideC=0.0, sideD=0.0)", quadrangle.toString());
    }

    @Test
    void givenQuadrangle_whenCalculateArea_returnZero() {
        Quadrangle quadrangle = new Quadrangle(1, 2, 3, 4);
        assertEquals(0.0, quadrangle.area());
    }
}
