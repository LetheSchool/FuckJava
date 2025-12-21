package cyrenehoney.T9Q3;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Manager extends Employee {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.20;
    }
}