package cyrenehoney.T9Q2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int maxSpeed, int numDoors) {
        super(brand, maxSpeed);
        this.numDoors = numDoors;
    }

    public void displayDetails() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("Doors: " + numDoors);
    }
}