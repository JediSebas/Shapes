package com.jedisebas.shapes.solids.prism;

import com.jedisebas.shapes.WrongFigureException;
import com.jedisebas.shapes.quadrangle.Parallelogram;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class Cube extends Prism {

    public Cube(final double side) throws WrongFigureException {
        super(Parallelogram.createSquare(side), side);
    }

    public Cube() throws WrongFigureException {
        this(0);
    }
}
