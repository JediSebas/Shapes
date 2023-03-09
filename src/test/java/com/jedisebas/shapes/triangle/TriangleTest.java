package com.jedisebas.shapes.triangle;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class TriangleTest {

    @Test
    void givenSideAndHeight_whenCalculateArea_thenReturnArea() {
        Triangle triangle = new Triangle(5, 1, 1, 4, 1, 1);
        assertEquals(10.0, triangle.area());
    }

    @Test
    void givenZero_whenCalculateArea_thenReturnZero() {
        Triangle triangle = new Triangle(0, 0 ,0, 0, 0, 0);
        assertEquals(0.0, triangle.area());
    }
}
