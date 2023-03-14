package com.jedisebas.shapes.triangle;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TriangleChainBuilder {

    private static TriangleChainBuilder instance;
    private double sideA;
    private double sideB;
    private double sideC;
    private double heightA;
    private double heightB;
    private double heightC;

    public static TriangleChainBuilder getInstance() {
        if (instance == null) {
            instance = new TriangleChainBuilder();
        }
        return instance;
    }

    public Triangle build() {
        return new Triangle(sideA, sideB, sideC, heightA, heightB, heightC);
    }


    public TriangleChainBuilder setSideA(double sideA) {
        this.sideA = sideA;
        return this;
    }

    public TriangleChainBuilder setSideB(double sideB) {
        this.sideB = sideB;
        return this;
    }

    public TriangleChainBuilder setSideC(double sideC) {
        this.sideC = sideC;
        return this;
    }

    public TriangleChainBuilder setHeightA(double heightA) {
        this.heightA = heightA;
        return this;
    }

    public TriangleChainBuilder setHeightB(double heightB) {
        this.heightB = heightB;
        return this;
    }

    public TriangleChainBuilder setHeightC(double heightC) {
        this.heightC = heightC;
        return this;
    }
}
