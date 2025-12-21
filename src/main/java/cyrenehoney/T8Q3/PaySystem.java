package cyrenehoney.T8Q3;

public class PaySystem {
    private double payRate; // 题目怪, 工资率何意味
    private int hours;

    public PaySystem(double payRate, int hours) {
        this.payRate = payRate;
        this.hours = hours;
    }

    public double totalPay() {
        return payRate * hours;
    }

    public double totalPay(int givenHours) {
        return payRate * givenHours;
    }
}
