package com.jedisebas.shapes.quadrangle;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class QuadrangleTest {

    @Test
    void givenEmpty_whenToString_returnTrue() {
        Quadrangle quadrangle = new Quadrangle();
        assertEquals("Quadrangle(sideA=0.0, sideB=0.0, sideC=0.0, sideD=0.0)", quadrangle.toString());
    }

}
