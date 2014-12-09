package com.selftest;

import java.util.stream.DoubleStream;

public class Shapes {

    public static abstract class TwoDShape {
        private double width;
        private double height;
        private String name;

        public TwoDShape() {
            width = height = 0.0;
            name = "none";
        }

        public TwoDShape(double width, double height, String name) {
            this.width = width;
            this.height = height;
            this.name = name;
        }

        public TwoDShape(double x, String name) {
            this(x, x, name);
        }

        public TwoDShape(TwoDShape other) {
            this(other.width, other.height, other.name);
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public String getName() {
            return name;
        }

        public abstract double getArea();
    };

    public static class Circle extends TwoDShape {

        public Circle(double diameter) {
            super(diameter, "circle");
        }

        @Override
        public double getArea() {
            return Math.PI * Math.pow(getWidth() / 2, 2);
        }
    }

    public static void main(String[] args) {
        DoubleStream.iterate(10, d -> d * 2).limit(10)
                    .mapToObj( d -> String.format("Circle with diameter of %.2f has an area of %.2f", d, new Circle(d).getArea()))
                    .forEach(System.out::println);
    }
}
