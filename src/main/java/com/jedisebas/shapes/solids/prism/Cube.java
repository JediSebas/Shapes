package com.jedisebas.shapes.solids.prism;

import com.jedisebas.shapes.WrongFigureException;
import com.jedisebas.shapes.quadrangle.Parallelogram;

public class Cube extends Prism {

    public Cube(final double side) throws WrongFigureException {
        super(Parallelogram.createSquare(side), side);
    }

    @Override
    public double circumference() {
        return 12 * height;
    }
}
