package com.jedisebas.shapes.quadrangle;

import com.jedisebas.shapes.Figure;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Quadrangle extends Figure {

    final double sideA;
    final double sideB;
    final double sideC;
    final double sideD;

    public Quadrangle(final double sideA, final double sideB, final double sideC, final double sideD) {
        validateNumber(sideA, sideB, sideC, sideD);
        setCorners(4);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double circumference() {
        return sideA + sideB + sideC + sideD;
    }
}
