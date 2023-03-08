package com.jedisebas.shapes.quadrangle;

import com.jedisebas.shapes.Figure;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Quadrangle extends Figure {

    final double sideA;
    final double sideB;
    final double sideC;
    final double sideD;

    public Quadrangle() {
        this(0, 0, 0, 0);
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
