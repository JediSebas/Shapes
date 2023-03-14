package com.jedisebas.shapes.triangle;

import com.jedisebas.shapes.Figure;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class Triangle extends Figure {

    final double sideA;
    final double sideB;
    final double sideC;
    final double heightA;
    final double heightB;
    final double heightC;

    public Triangle(final double sideA, final double sideB, final double sideC,
                    final double heightA, final double heightB, final double heightC) {
        validateNumber(sideA, sideB, sideC, heightA, heightB, heightC);
        setCorners(3);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightA = heightA;
        this.heightB = heightB;
        this.heightC = heightC;
    }

    public static Triangle createEquilateralTriangle(final double side, final double height) {
        validateNumber(side, height);
        return new Triangle(side, side, side, height, height, height);
    }

    public static Triangle createIsoscelesTriangle(final double sideAB, final double sideC, final double heightAB, final double heightC) {
        validateNumber(sideAB, sideC, heightAB, heightC);
        return new Triangle(sideC, sideC, sideC, heightAB, heightAB, heightC);
    }

    @Override
    public double area() {
        return sideA * heightA / 2;
    }

    @Override
    public double circumference() {
        return sideA + sideB + sideC;
    }
}
