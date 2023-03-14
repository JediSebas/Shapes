package com.jedisebas.shapes.triangle;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TriangleBuilder {

    private static TriangleBuilder instance;
    private double sideA;
    private double sideB;
    private double sideC;
    private double heightA;
    private double heightB;
    private double heightC;

    public static TriangleBuilder getInstance() {
        if (instance == null) {
            return new TriangleBuilder();
        }
        return instance;
    }

    public Triangle build() {
        return new Triangle(sideA, sideB, sideC, heightA, heightB, heightC);
    }
}
