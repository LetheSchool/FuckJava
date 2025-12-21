package cyrenehoney.L9Q4;

public class FuckJava {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("P999", "SuperPhone X", 1000.0, 24, "TechBrand", 128);

        System.out.println("Product ID: " + phone.getProductId());
        System.out.println("Product Name: " + phone.getProductName());
        System.out.println("Brand: " + phone.getBrandName());
        System.out.println("Storage: " + phone.getStorageGB() + "GB");
        System.out.println("Warranty: " + phone.getWarrantyDuration() + " months");
        System.out.printf("Final Price: %.2f%n", phone.getPrice());
    }
}
