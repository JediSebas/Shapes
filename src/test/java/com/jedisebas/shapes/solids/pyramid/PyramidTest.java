package com.jedisebas.shapes.solids.pyramid;

import com.jedisebas.shapes.WrongFigureException;
import com.jedisebas.shapes.circle.Circle;
import com.jedisebas.shapes.quadrangle.Parallelogram;
import com.jedisebas.shapes.triangle.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidTest {

    @Test
    void givenPyramid_whenCalculateVolume_thenReturnResult() {
        Triangle base = Triangle.createEquilateralTriangle(1, Math.sqrt(3) / 2);
        Pyramid pyramid = new Pyramid(base, 1);

        assertEquals(Math.sqrt(3) / 2, pyramid.volume());
    }

    @Test
    void givenPyramid_whenCalculateCircumference_thenReturnResult() throws WrongFigureException {
        Parallelogram base = Parallelogram.createSquare(1);
        Pyramid pyramid = new Pyramid(base, 2);

        double circumference = base.circumference() + Math.sqrt(Math.pow(base.getSideA() / 2, 2) + Math.pow(pyramid.height, 2));

        assertEquals(circumference, pyramid.circumference());
    }

    @Test
    void givenPyramid_whenCalculateArea_thenReturnResult() {
        Circle base = new Circle(1);
        Pyramid pyramid = new Pyramid(base, 1);

        double area = base.area() + Math.sqrt(Math.pow(base.getRadius() / 2, 2) + Math.pow(pyramid.height, 2)) * base.circumference();

        assertEquals(area, pyramid.area());
    }

    @Test
    void givenNegativeValue_whenCalculateArea_thenThrowException() {
        Circle base = new Circle(1);
        assertThrows(IllegalArgumentException.class, () -> new Pyramid(base, -1));
    }

    @Test
    void givenNull_whenEquals_thenReturnFalse() {
        Pyramid pyramid1 = null;
        Pyramid pyramid2 = new Pyramid(new Circle(1), 1);

        assertNotEquals(pyramid1, pyramid2);
    }

    @Test
    void givenPyramid_whenEquals_thenReturnFalse() throws WrongFigureException {
        Pyramid pyramid1 = new Pyramid(new Circle(1), 1);
        Pyramid pyramid2 = new Pyramid(Parallelogram.createSquare(Math.sqrt(Math.PI)), 1);

        assertNotEquals(pyramid1, pyramid2);
    }
}
