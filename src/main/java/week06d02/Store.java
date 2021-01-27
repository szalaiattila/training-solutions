package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
    public intgetProductByCategoryName(Category categoryName) {
        int count = 0;

        for (Product p : products) {
            if (p.getCategory() == categoryName) {
                count++;
            }
        }
    }
    return count;
}
