package cyrenehoney.L8Q1;

import java.util.Scanner;

public class Circle extends Shape {
    private double diameter;

    public Circle() {
        setName("Circle");
    }

    public void acceptInput() {
        var scanner = new Scanner(System.in);
        System.out.print("Enter diameter for Circle: ");
        diameter = scanner.nextDouble();
    }

    public void compute() {
        var radius = diameter / 2;
        setPerimeter(Math.PI * diameter);
        setArea(Math.PI * radius * radius);
    }
}