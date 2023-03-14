package com.jedisebas.shapes.solids;

import com.jedisebas.shapes.Figure;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public abstract class Figure3D extends Figure implements IVolume {

    public static void validateBase(final Figure figure) {
        if (figure == null) {
            throw new IllegalArgumentException("You cannot use null base");
        }
    }

    /**
     * In this case we understand circumference as the sum of every side
     */
    @Override
    public double circumference() {
        return 0;
    }
}
