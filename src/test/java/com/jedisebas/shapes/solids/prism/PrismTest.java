package com.jedisebas.shapes.solids.prism;

import com.jedisebas.shapes.WrongFigureException;
import com.jedisebas.shapes.circle.Circle;
import com.jedisebas.shapes.quadrangle.Parallelogram;
import com.jedisebas.shapes.quadrangle.Trapezoid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrismTest {

    @Test
    void givenPrism_whenCalculateArea_thenReturnResult() throws WrongFigureException {
        Parallelogram base = Parallelogram.createSquare(1);
        double height = 1;
        Prism prism = new Prism(base, 1);

        double area = base.area() * 2 + height * base.getSideA() + height * base.getSideB() +
                height * base.getSideC() + height * base.getSideD();

        assertEquals(area, prism.area());
    }

    @Test
    void givenPrism_whenCalculateCircumference_thenReturnResult() {
        Circle base = new Circle(2);
        double height = 13;
        Prism prism = new Prism(base, height);

        double circumference = base.circumference() * 2;

        assertEquals(circumference, prism.circumference());
    }

    @Test
    void givenNegativePrism_whenCalculateArea_thenThrowException() {
        Circle base = new Circle(1);
        assertThrows(IllegalArgumentException.class, () -> new Prism(base, -1));
    }

    @Test
    void givenPrism_whenCalculateVolume_thenReturnResult() {
        Trapezoid base = new Trapezoid(2, 1, 3, 7, 4);
        double height = 20;
        Prism prism = new Prism(base, height);

        double volume = base.area() * height;

        assertEquals(volume, prism.volume());
    }

    @Test
    void givenPrisms_whenEquals_thenReturnFalse() throws WrongFigureException {
        Prism prism1 = new Prism(new Circle(1), 1);
        Prism prism2 = new Prism(Parallelogram.createSquare(1), 1);

        assertNotEquals(prism1, prism2);
    }

    @Test
    void givenObject_whenEquals_thenReturnFalse() {
        Prism prism1 = new Prism(new Circle(1), 1);
        Object notPrismInstance = new Object();

        assertNotEquals(prism1, notPrismInstance);
    }

    @Test
    void givenNull_whenEquals_thenReturnFalse() {
        Prism prism1 = new Prism(new Circle(1), 1);
        assertNotEquals(null, prism1);
    }

    @Test
    void givenNullBase_thenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Prism(null, 2));
    }
}
