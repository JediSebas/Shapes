package com.jedisebas.shapes.solids.prism;

import com.jedisebas.shapes.WrongFigureException;
import com.jedisebas.shapes.quadrangle.Parallelogram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CubeTest {

    @Test
    void givenCube_whenCalculateVolume_thenReturnResult() throws WrongFigureException {
        Cube cube = new Cube(2);
        assertEquals(2 * 2 * 2, cube.volume());
    }

    @Test
    void givenCube_whenCalculateArea_thenReturnResult() throws WrongFigureException {
        Cube cube = new Cube(3);
        assertEquals(54, cube.area());
    }

    @Test
    void givenCube_whenCalculateCircumference_thenReturnResult() throws WrongFigureException {
        Cube cube = new Cube(3);
        assertEquals(36, cube.circumference());
    }

    @Test
    void givenCubeAndPrism_whenEquals_thenReturnTrue() throws WrongFigureException {
        Cube cube1 = new Cube(1);
        Prism cube2 = new Prism(Parallelogram.createRectangle(1, 1), 1);

        assertEquals(cube1, cube2);
    }


    @Test
    void givenCubeAndPrism2_whenEquals_thenReturnTrue() throws WrongFigureException {
        Cube cube1 = new Cube(1);
        Prism cube2 = new Prism(Parallelogram.createSquare(1), 1);

        assertEquals(cube1, cube2);
    }

    @Test
    void givenNegativeValue_whenCalculateArea_thenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Cube(-1));
    }

    @Test
    void givenEmpty_whenCalculateArea_thenReturnZero() throws WrongFigureException {
        Cube cube = new Cube();
        assertEquals(0.0, cube.area());
    }
}
