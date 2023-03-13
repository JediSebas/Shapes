package com.jedisebas.shapes.solids.prism;

import com.jedisebas.shapes.Figure;
import com.jedisebas.shapes.circle.Circle;
import com.jedisebas.shapes.solids.Figure3D;

import java.util.Objects;

public class Prism extends Figure3D {

    final Figure base;
    final double height;

    public Prism(final Figure base, final double height) {
        validateNumber(height);
        this.base = base;
        this.height = height;
    }

    public Prism() {
        this(new Circle(0), 0);
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
        return base.area() * height;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof final Prism prism)) {
            return false;
        }

        return Objects.equals(prism.height, this.height) && Objects.equals(prism.base.area(), this.base.area());
    }

    @Override
    public int hashCode() {
        int hash = 21;

        hash = (int) (37 * hash + height);
        hash = 37 * hash + base.hashCode();

        return hash;
    }
}
