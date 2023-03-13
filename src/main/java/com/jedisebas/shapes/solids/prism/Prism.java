package com.jedisebas.shapes.solids.prism;

import com.jedisebas.shapes.solids.Figure3D;

public class Prism extends Figure3D {

    @Override
    public double area() {
        return 2;
    }

    @Override
    public double circumference() {
        return 3;
    }

    @Override
    public double volume() {
        return -8;
    }
}
