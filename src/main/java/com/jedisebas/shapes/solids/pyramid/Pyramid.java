package com.jedisebas.shapes.solids.pyramid;

import com.jedisebas.shapes.Figure;
import com.jedisebas.shapes.circle.Circle;
import com.jedisebas.shapes.solids.Figure3D;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class Pyramid extends Figure3D {

    final Figure base;
    final double height;

    public Pyramid(final Figure base, final double height) {
        validateNumber(height);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        if (base.getClass() == Circle.class) {
            return base.area() + Math.sqrt(Math.pow(((Circle) base).getRadius() / 2, 2) + Math.pow(height, 2)) * base.circumference();
        } else {
            return base.area() + Math.sqrt(Math.pow((base.circumference() / base.getCorners()) / 2, 2) + Math.pow(height, 2)) * base.circumference();
        }

    }

    @Override
    public double circumference() {
        return base.circumference() + Math.sqrt(Math.pow((base.circumference() / base.getCorners()) / 2, 2) + Math.pow(height, 2));
    }

    @Override
    public double volume() {
        return base.area() * height / 3;
    }
}
