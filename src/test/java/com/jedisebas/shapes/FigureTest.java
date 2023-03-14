package com.jedisebas.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals("Figure(corners=0.0)", figure.toString());
    }
}
