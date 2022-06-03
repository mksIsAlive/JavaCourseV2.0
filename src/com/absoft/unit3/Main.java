package com.absoft.unit3;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class Main {

    public static void main(String[] args) {
//        showRobotsHw();

        showShapesHw();

    }

    private static void showShapesHw() {
        Shape shape1 = new Rectangle(2, 3);
        Shape shape2 = new Rectangle(4, 5);

        System.out.println(shape1.getSquare());
        System.out.println(shape2.getSquare());

        shape1 = new Circle(10);
        System.out.println(shape1.getSquare());


        Circle shape3 = new Circle(9);
        System.out.println(shape3.getSquare());
        System.out.println(shape3.getRadius());

        System.out.println("====");
        Circle shape4 = new Circle(5);
        System.out.println(shape4.getRadius());
        System.out.println(shape3.getRadius() + " sdasd");
        shape4.setRadius(1);
        System.out.println(shape4.getRadius());

        System.out.println(shape3.getRadius());


        System.out.println("example");
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        System.out.println(circle1.getRadius());


        System.out.println("========!");
        Rectangle variable = new Rectangle(3, 2);
        System.out.println(variable.getSquare());

        variable = new Square(3);
        System.out.println(variable.getSquare());

        var square = new Square(10);
        System.out.println(square.getSide1());
        System.out.println(square.getSide2());
        System.out.println(square.getSquareSide());
    }
}