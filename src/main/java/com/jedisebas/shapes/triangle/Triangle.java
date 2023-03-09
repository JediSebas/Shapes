package com.jedisebas.shapes.triangle;

import com.jedisebas.shapes.Figure;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Triangle extends Figure {

    final double sideA;
    final double sideB;
    final double sideC;
    final double heightA;
    final double heightB;
    final double heightC;

    public static Triangle createEquilateralTriangle(final double side, final double height) {
        return new Triangle(side, side, side, height, height, height);
    }

    public static Triangle createIsoscelesTriangle(final double sideAB, final double sideC, final double heightAB, final double heightC) {
        return new Triangle(sideAB, sideAB, sideC, heightAB, heightAB, heightC);
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
