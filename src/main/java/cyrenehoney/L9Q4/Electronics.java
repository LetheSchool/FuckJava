package cyrenehoney.L9Q4;

class Electronics extends Product {
    private int warrantyDuration;

    public Electronics(String productId, String productName, double productPrice, int warrantyDuration) {
        super(productId, productName, productPrice);
        this.warrantyDuration = warrantyDuration;
    }

    public int getWarrantyDuration() {
        return warrantyDuration;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.15;
    }
}