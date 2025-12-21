package cyrenehoney.L8Q1;

import java.util.Scanner;

public class Square extends Shape {
    private double sideLength;

    public Square() {
        setName("Square");
    }

    public void acceptInput() {
        var scanner = new Scanner(System.in);
        System.out.print("Enter side length for Square: ");
        sideLength = scanner.nextDouble();
    }

    public void compute() {
        setPerimeter(4 * sideLength);
        setArea(sideLength * sideLength);
    }
}