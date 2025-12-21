package cyrenehoney.L10Q1;

public abstract class Employee {
    protected String name;
    protected String type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Salary: " + calculateSalary();
    }
}