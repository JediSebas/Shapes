package com.jedisebas.shapes.quadrangle;

import com.jedisebas.shapes.WrongFigureException;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Parallelogram extends Trapezoid {

    public Parallelogram(final double sideA, final double sideB, final double sideC,
                         final double sideD, final double height) throws WrongFigureException {
        super(sideA, sideB, sideC, sideD, height);

        if (!(sideA == sideB && sideC == sideD)) {
            throw new WrongFigureException(this);
        }
    }

    public Parallelogram() {
        super(0, 0, 0, 0, 0);
    }
}
