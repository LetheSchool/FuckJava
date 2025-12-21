package cyrenehoney.T10Q1;

public class FuckJava {
    public static void main(String[] args) {
        DiscountPolicy bulk = new BulkDiscount(5, 15);
        DiscountPolicy other = new OtherDiscount();
        DiscountPolicy combine = new CombineDiscount(bulk, other);

        int count = 7;
        double cost = 100.0;

        System.out.println(bulk.computeDiscount(count, cost));
        System.out.println(other.computeDiscount(count, cost));
        System.out.println(combine.computeDiscount(count, cost));
    }
}
