package com.jedisebas.shapes;

import com.jedisebas.shapes.circle.Circle;
import com.jedisebas.shapes.quadrangle.Parallelogram;
import com.jedisebas.shapes.quadrangle.Quadrangle;
import com.jedisebas.shapes.quadrangle.Trapezoid;

public class Main {
    public static void main(String[] args) {

        Figure circle = new Circle(4);

        System.out.println(circle.circumference());

        Figure quadrangle1 = new Quadrangle(4, 5, 3, 2);
        Figure quadrangle2 = new Quadrangle(4, 5, 3, 2);

        System.out.println(quadrangle1.equals(quadrangle2));

        try {
            Figure parallelogram = new Parallelogram(2, 3, 4, 5, 1);
        } catch (WrongFigureException e) {
            throw new RuntimeException(e);
        }

        var trapezoid = new Trapezoid(2, 3, 4, 5, 1);

        System.out.println(trapezoid.getHeight());
    }
}