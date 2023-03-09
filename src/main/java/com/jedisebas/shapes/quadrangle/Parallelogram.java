package com.jedisebas.shapes.quadrangle;

import com.jedisebas.shapes.WrongFigureException;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Parallelogram extends Trapezoid {

    final double heightB;

    public Parallelogram(final double sideA, final double sideB, final double sideC,
                         final double sideD, final double heightA, final double heightB) throws WrongFigureException {
        super(sideA, sideB, sideC, sideD, heightA);
        this.heightB = heightB;

        if (!(sideA == sideB && sideC == sideD)) {
            throw new WrongFigureException(this);
        }
    }

    public Parallelogram() throws WrongFigureException {
        this(0, 0, 0, 0, 0, 0);
    }

    public static Parallelogram createRectangle(final double sideA, final double sideB) throws WrongFigureException {
        return new Parallelogram(sideA, sideA, sideB, sideB, sideB, sideA);
    }

    public static Parallelogram createRhombus(final double side, final double height) throws WrongFigureException {
        return new Parallelogram(side, side, side, side, height, height);
    }

    public static Parallelogram createSquare(final double side) throws WrongFigureException {
        return createRectangle(side, side);
    }
}
