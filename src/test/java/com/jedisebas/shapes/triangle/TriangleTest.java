package com.jedisebas.shapes.triangle;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class TriangleTest {

    @Test
    void sideFiveHeightThreeEqualsTen() {
        Triangle triangle = new Triangle(5, 1, 1, 4, 1, 1);
        assertEquals(10.0, triangle.area());
    }
}
