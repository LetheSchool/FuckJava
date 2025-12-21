package cyrenehoney.T9Q3;

public class FuckJava {
    public static void main(String[] args) {
        var emp = new Employee("Alice", 1000.0);

        System.out.println("Bonus: " + emp.calculateBonus());
        System.out.println("Total Compensation: " + emp.getTotalCompensation());
    }
}
