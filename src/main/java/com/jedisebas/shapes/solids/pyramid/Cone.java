package com.jedisebas.shapes.solids.pyramid;

import com.jedisebas.shapes.circle.Circle;

public class Cone extends Pyramid {

    Cone(final Circle base, final double height) {
        super(base, height);
    }

    @Override
    public double area() {
        return base.area() + Math.sqrt(Math.pow(((Circle) base).getRadius() / 2, 2) + Math.pow(height, 2)) * base.circumference();
    }

    @Override
    public double circumference() {
        return base.circumference();
    }
}
