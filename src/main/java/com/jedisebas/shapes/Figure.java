package com.jedisebas.shapes;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public abstract class Figure implements IArea, ICircumference {

    int corners;

    public static void validateNumber(double... numbers) {
        for (final double number : numbers) {
            if (number <= 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    public double getCorners() {
        return corners;
    }

    public void setCorners(final int corners) {
        this.corners = corners;
    }
}
