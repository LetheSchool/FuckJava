package cyrenehoney.L8Q1;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        setName("Rectangle");
    }

    public void acceptInput() {
        var scanner = new Scanner(System.in);
        System.out.print("Enter width for Rectangle: ");
        width = scanner.nextDouble();
        System.out.print("Enter length for Rectangle: ");
        length = scanner.nextDouble();
    }

    public void compute() {
        setPerimeter(2 * (width + length));
        setArea(width * length);
    }
}