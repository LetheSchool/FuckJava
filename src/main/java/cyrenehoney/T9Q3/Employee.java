package cyrenehoney.T9Q3;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateBonus() {
        return baseSalary * 0.10;
    }

    public double getTotalCompensation() {
        return baseSalary + calculateBonus();
    }
}