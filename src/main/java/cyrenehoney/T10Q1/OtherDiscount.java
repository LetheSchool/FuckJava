package cyrenehoney.T10Q1;

public class OtherDiscount extends DiscountPolicy {
    @Override
    public double computeDiscount(int count, double itemCost) {
        double rate = 0;
        if (count >= 3 && count <= 5) {
            rate = 0.10;
        } else if (count >= 6 && count <= 8) {
            rate = 0.20;
        } else if (count > 8) {
            rate = 0.30;
        }
        return count * itemCost * rate;
    }
}