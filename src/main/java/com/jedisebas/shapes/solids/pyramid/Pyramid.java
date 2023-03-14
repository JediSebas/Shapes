package com.jedisebas.shapes.solids.pyramid;

import com.jedisebas.shapes.Figure;
import com.jedisebas.shapes.solids.Figure3D;

public class Pyramid extends Figure3D {

    final Figure base;
    final double height;

    public Pyramid(final Figure base, final double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double circumference() {
        return 0;
    }

    @Override
    public double volume() {
        return base.area() * height / 3;
    }
}
