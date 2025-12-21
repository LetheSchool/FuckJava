package cyrenehoney.T8Q3;

public class SpecialPay extends PaySystem {
    private static final double BLACK_HEART_RATE = 1.3;

    public SpecialPay(double payRate, int hours) {
        super(payRate, hours);
    }

    @Override
    public double totalPay() {
        return super.totalPay() * BLACK_HEART_RATE;
    }

    @Override
    public double totalPay(int givenHours) {
        return super.totalPay(givenHours) * BLACK_HEART_RATE;
    }
}
