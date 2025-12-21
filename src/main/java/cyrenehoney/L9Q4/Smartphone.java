package cyrenehoney.L9Q4;

class Smartphone extends Electronics {
    private String brandName;
    private int storageGB;

    public Smartphone(String productId, String productName, double productPrice, int warrantyDuration, String brandName, int storageGB) {
        super(productId, productName, productPrice, warrantyDuration);
        this.brandName = brandName;
        this.storageGB = storageGB;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getStorageGB() {
        return storageGB;
    }

    @Override
    public double getPrice() {
        double price = super.getPrice();
        if (storageGB > 64) {
            price = price * 1.10;
        }
        return price;
    }
}