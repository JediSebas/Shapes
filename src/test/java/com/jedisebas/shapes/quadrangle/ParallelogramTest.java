package com.jedisebas.shapes.quadrangle;

import com.jedisebas.shapes.WrongFigureException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ParallelogramTest {

    @Test
    void givenSideAndHeight_whenCalculateArea_thenReturnArea() throws WrongFigureException {
        Parallelogram parallelogram = new Parallelogram(6, 6, 2, 2, 3, 4);
        assertEquals(18.0, parallelogram.area());
    }

    @Test
    void givenSideAndHeight_whenCalculateCircumference_thenReturnCircumference() throws WrongFigureException {
        Parallelogram parallelogram = new Parallelogram(6, 6, 2, 2, 3, 4);
        assertEquals(16.0, parallelogram.circumference());
    }

    @Test
    void givenRectangleAndSquare_whenEquals_thenReturnTrue() throws WrongFigureException {
        Parallelogram square = Parallelogram.createSquare(5);
        Parallelogram rectangle = Parallelogram.createRectangle(5, 5);
        assertEquals(square, rectangle);
    }

    @Test
    void givenRectangleAndSquare_whenEquals_thenReturnFalse() throws WrongFigureException {
        Parallelogram square = Parallelogram.createSquare(5);
        Parallelogram rectangle = Parallelogram.createRectangle(3, 4);
        assertNotEquals(square, rectangle);
    }

    @Test
    void givenSquareAndParallelogram_whenEquals_thenReturnFalse() throws WrongFigureException {
        Parallelogram square = Parallelogram.createSquare(2);
        Parallelogram parallelogram = new Parallelogram(2, 2, 4, 4, 3, 6);
        assertNotEquals(square, parallelogram);
    }

    @Test
    void givenRhombusAndRectangle_whenEquals_thenReturnFalse() throws WrongFigureException {
        Parallelogram rhombus = Parallelogram.createRhombus(3, 4);
        Parallelogram rectangle = Parallelogram.createRectangle(3, 4);
        assertNotEquals(rhombus, rectangle);
    }

    @Test
    void givenWrongValue_whenCalculateArea_thenThrowException() {
        assertThrows(WrongFigureException.class, () -> new Parallelogram(1, 2, 3, 4, 5, 6));
    }
}
