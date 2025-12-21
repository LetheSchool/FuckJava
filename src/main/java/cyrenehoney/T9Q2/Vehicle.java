package cyrenehoney.T9Q2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Vehicle {
    private String brand;
    private int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
}