package cyrenehoney.T8Q4;

public class SugarPurchase extends PurchaseSystem {
    private int weight;

    public SugarPurchase(int code, int unitPrice, int quantity, int weight) {
        super(code, unitPrice, quantity);
        this.weight = weight;
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() * weight;
    }
}
