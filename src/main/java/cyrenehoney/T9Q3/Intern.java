package cyrenehoney.T9Q3;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Intern extends Employee {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return 0;
    }
}