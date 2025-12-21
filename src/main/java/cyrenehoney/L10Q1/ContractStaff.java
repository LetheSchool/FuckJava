package cyrenehoney.L10Q1;

public class ContractStaff extends Employee {
    private double totalSales;

    public ContractStaff(String name, double totalSales) {
        super(name, "Contract");
        this.totalSales = totalSales;
    }

    @Override
    public double calculateSalary() {
        return 500 + (0.50 * totalSales);
    }
}