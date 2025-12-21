package cyrenehoney.T9Q4;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
    }
}