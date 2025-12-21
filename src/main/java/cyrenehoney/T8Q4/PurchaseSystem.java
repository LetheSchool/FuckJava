package cyrenehoney.T8Q4;

import lombok.Getter;

public class PurchaseSystem {
    private int code;
    private int unitPrice;
    private int quantity;
    @Getter private int totalPrice;
    public PurchaseSystem(int code, int unitPrice, int quantity) {
        this.code = code;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "PurchaseSystem{" +
                "code=" + code +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
