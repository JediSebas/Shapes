package com.jedisebas.shapes.quadrangle;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Trapezoid extends Quadrangle {

    final double heightA;

    public Trapezoid(final double sideA, final double sideB, final double sideC, final double sideD, final double heightA) {
        super(sideA, sideB, sideC, sideD);
        this.heightA = heightA;
    }

    public Trapezoid() {
        this(0, 0, 0, 0, 0);
    }

    @Override
    public double area() {
        return (sideA + sideB) * heightA / 2;
    }
}
