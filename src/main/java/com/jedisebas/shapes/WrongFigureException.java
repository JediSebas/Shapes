package com.jedisebas.shapes;

import com.jedisebas.shapes.quadrangle.Parallelogram;

public class WrongFigureException extends Exception {

    public WrongFigureException(final Figure figure) {
        super("Field data doesn't match with figure name");

        if (figure.getClass().equals(Parallelogram.class)) {
            System.out.println("Parallelogram need to have sideA = sideB and sideC = sideD");
        }
    }
}
