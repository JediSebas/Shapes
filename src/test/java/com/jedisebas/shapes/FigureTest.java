package com.jedisebas.shapes;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class FigureTest {

    @Test
    void givenFigure_whenToString_thenReturnTrue() {
        Figure figure = new Figure() {
            @Override
            public double area() {
                return 0;
            }

            @Override
            public double circumference() {
                return 0;
            }
        };
        assertEquals("Figure()", figure.toString());
    }
}
