package com.jedisebas.shapes.solids.pyramid;

import com.jedisebas.shapes.Figure;
import com.jedisebas.shapes.circle.Circle;

public class PyramidFactory {

    public static Pyramid createPyramid(final Figure figure, final double height) {
        if (figure.getClass().equals(Circle.class)) {
            return new Cone((Circle) figure, height);
        }

        return new Pyramid(figure, height);
    }
}
