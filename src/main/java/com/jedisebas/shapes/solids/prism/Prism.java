package com.jedisebas.shapes.solids.prism;

import com.jedisebas.shapes.Figure;
import com.jedisebas.shapes.solids.Figure3D;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class Prism extends Figure3D {

    final Figure base;
    final double height;

    public Prism(final Figure base, final double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base.area() * 2 + base.circumference() * height;
    }

    @Override
    public double circumference() {
        return base.circumference() * 2 + height * base.getCorners();
    }

    @Override
    public double volume() {
        return 0;
    }
}
