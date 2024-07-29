package GB.Seminar_7.CW7;

import GB.Seminar_7.CW7.product.Bottle;
import GB.Seminar_7.CW7.product.Product;
import GB.Seminar_7.CW7.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
//        Product product1 = new Product();
//        product1.setName("lays");
//        product1.setPrice(90);
        Product product1 = new Product("lays", 90);
        Bottle product2 = new Bottle("coca-cola", 120, 2);
        Product product3 = new Product("twix", 100);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine);
    }
}
