package com.jedisebas.shapes.solids.prism;

import com.jedisebas.shapes.Figure;
import com.jedisebas.shapes.solids.Figure3D;

public class Prism extends Figure3D {

    final Figure base;
    final double height;

    public Prism(final Figure base, final double height) {
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
        return 0;
    }
}
