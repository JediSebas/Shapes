package com.jedisebas.shapes.quadrangle;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class Trapezoid extends Quadrangle {

    final double heightA;

    public Trapezoid(final double sideA, final double sideB, final double sideC, final double sideD, final double heightA) {
        super(sideA, sideB, sideC, sideD);
        this.heightA = heightA;
    }

    @Override
    public double area() {
        return (sideA + sideB) * heightA / 2;
    }

    @Override
    public String toString() {
        return "Trapezoid(" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", sideD=" + sideD +
                ", heightA=" + heightA +
                ')';
    }
}
