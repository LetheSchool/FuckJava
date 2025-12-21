package cyrenehoney.L10Q1;

public class PermanentEmployee extends Employee {
    private char category;

    public PermanentEmployee(String name, char category) {
        super(name, "Permanent");
        this.category = category;
    }

    @Override
    public double calculateSalary() {
        switch (category) {
            case 'A': return 4000;
            case 'B': return 3000;
            case 'C': return 2000;
            default: return 0;
        }
    }
}