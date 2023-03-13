package com.jedisebas.shapes.solids.prism;

import com.jedisebas.shapes.WrongFigureException;
import com.jedisebas.shapes.quadrangle.Parallelogram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrismTest {

    @Test
    void givenPrism_whenCalculateArea_thenReturnResult() throws WrongFigureException {
        Parallelogram base = Parallelogram.createSquare(1);
        double height = 1;
        Prism prism = new Prism(base, 1);

        double area = base.area() * 2 + height * base.getSideA() + height * base.getSideB() +
                height * base.getSideC() + height * base.getSideD();

        assertEquals(area, prism.area());
    }
}
