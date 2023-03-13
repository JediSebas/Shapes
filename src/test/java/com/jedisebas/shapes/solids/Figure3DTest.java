package com.jedisebas.shapes.solids;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Figure3DTest {

    @Test
    void givenFigure3D_whenToString_thenReturnTrue() {
        Figure3D figure3D = new Figure3D() {
            @Override
            public double area() {
                return 0;
            }

            @Override
            public double circumference() {
                return 0;
            }

            @Override
            public double volume() {
                return 0;
            }
        };

        assertEquals("Figure3D()", figure3D.toString());
    }
}
