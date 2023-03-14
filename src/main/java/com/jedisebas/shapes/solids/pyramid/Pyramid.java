package com.jedisebas.shapes.solids.pyramid;

import com.jedisebas.shapes.Figure;
import com.jedisebas.shapes.solids.Figure3D;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class Pyramid extends Figure3D {

    protected final Figure base;
    protected final double height;

    protected Pyramid(final Figure base, final double height) {
        validateNumber(height);
        validateBase(base);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base.area() + areaOfOtherSides();
    }

    private double areaOfOtherSides() {
        return Math.sqrt(Math.pow((base.circumference() / base.getCorners()) / 2, 2) + Math.pow(height, 2)) * base.circumference();
    }

    @Override
    public double circumference() {
        return base.circumference() + circumferenceOfOtherSides();
    }

    private double circumferenceOfOtherSides() {
        return Math.sqrt(Math.pow((base.circumference() / base.getCorners()) / 2, 2) + Math.pow(height, 2));
    }

    @Override
    public double volume() {
        return base.area() * height / 3;
    }
}
