package cyrenehoney.L10Q1;

public class TemporaryStaff extends Employee {
    private int hoursWorked;

    public TemporaryStaff(String name, int hoursWorked) {
        super(name, "Temporary");
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return 15 * hoursWorked;
    }
}