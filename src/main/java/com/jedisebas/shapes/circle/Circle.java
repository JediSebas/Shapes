package com.jedisebas.shapes.circle;


import com.jedisebas.shapes.Figure;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Circle extends Figure {

    final double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
