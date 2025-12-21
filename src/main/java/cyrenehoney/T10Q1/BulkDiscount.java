package cyrenehoney.T10Q1;

public class BulkDiscount extends DiscountPolicy {
    private int minimum;
    private double discountRate;

    public BulkDiscount(int minimum, double discountRate) {
        this.minimum = minimum;
        this.discountRate = discountRate;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        if (count > minimum) {
            return count * itemCost * (discountRate / 100.0);
        }
        return 0;
    }
}