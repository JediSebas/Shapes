package com.jedisebas.shapes.circle;


import com.jedisebas.shapes.Figure;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class Circle extends Figure {

    final double radius;

    public Circle(final double radius) {
        validateNumber(radius);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
