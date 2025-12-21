package cyrenehoney.L8Q1;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Shape {
    private String name;
    private double perimeter;
    private double area;

    public void display() {
        System.out.println("Shape: " + name);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Area: %.2f%n", area);
    }
}