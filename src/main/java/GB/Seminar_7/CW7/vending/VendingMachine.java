package GB.Seminar_7.CW7.vending;

import GB.Seminar_7.CW7.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public int size(){
        return products.size();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список товаров:\n");
        for (Product product: products) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
