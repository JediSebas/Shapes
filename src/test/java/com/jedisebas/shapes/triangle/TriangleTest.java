package com.jedisebas.shapes.triangle;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void givenEquilateralTriangle_whenCalculateCircumference_thenReturnCircumference() {
        Triangle triangle = Triangle.createEquilateralTriangle(5, 4);
        assertEquals(15.0, triangle.circumference());
    }

    @Test
    void givenIsoscelesTriangleAndEquilateralTriangle_whenEquals_thenReturnTrue() {
        Triangle triangle1 = Triangle.createEquilateralTriangle(4, 2);
        Triangle triangle2 = Triangle.createIsoscelesTriangle(4, 4, 2, 2);
        assertEquals(triangle1, triangle2);
    }

    @Test
    void givenIsoscelesTriangleAndEquilateralTriangle_whenEquals_thenReturnFalse() {
        Triangle triangle1 = Triangle.createEquilateralTriangle(4, 6);
        Triangle triangle2 = Triangle.createIsoscelesTriangle(4, 3, 6, 8);
        assertNotEquals(triangle1, triangle2);
    }

    @Test
    void givenNegativeValue_whenCalculateArea_thenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-1, -1, -1, -1, -1, -1));
    }
}
