package cyrenehoney.L11Q6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Fuckjava {
    public static void main(String[] args) {
        var products = new HashMap<String, String[]>();

        try {
            var productScanner = new Scanner(new File("product.txt"));
            while (productScanner.hasNextLine()) {
                var line = productScanner.nextLine();
                var parts = line.split(",");
                if (parts.length == 3) {
                    products.put(parts[0], new String[]{parts[1], parts[2]});
                }
            }
            productScanner.close();

            var orderScanner = new Scanner(new File("order.txt"));
            System.out.println("ProductID | ProductName | Quantity | Price | Total");

            while (orderScanner.hasNextLine()) {
                var line = orderScanner.nextLine();
                var orderParts = line.split(",");

                if (orderParts.length == 3) {
                    var productID = orderParts[1];
                    var quantity = Integer.parseInt(orderParts[2]);

                    if (products.containsKey(productID)) {
                        var productDetails = products.get(productID);
                        var productName = productDetails[0];
                        var price = Double.parseDouble(productDetails[1]);
                        var totalPrice = price * quantity;

                        System.out.println(productID + " | " + productName + " | " +
                            quantity + " | " + price + " | " + totalPrice);
                    }
                }
            }
            orderScanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
