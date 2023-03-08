package com.jedisebas.shapes.quadrangle;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Trapezoid extends Quadrangle {

    final double height;

    public Trapezoid(final double sideA, final double sideB, final double sideC, final double sideD, final double height) {
        super(sideA, sideB, sideC, sideD);
        this.height = height;
    }

    public Trapezoid() {
        this(0, 0, 0, 0, 0);
    }

    @Override
    public double area() {
        return (sideA + sideB) * height / 2;
    }
}
