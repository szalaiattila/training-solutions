package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public boolean addProduct(Product paraProduct) {
        if((!isValid(paraProduct))) {
            return false;
        }
        products.add(paraProduct);
        return true;
    }

    public int getNumberOfRxpired() {
        int count = 0;
        for (Product p : products) {
            if (p.isExpired()) {
                count++;
            }
        }
        return count;
    }


    private boolean isValid(Product paraProduc) {
        if(containsByName(paraProduc) || paraProduc.isExpired()){
            return false;
        }
        return  true;
    }

    private  boolean containsByName(Product paraProduct) {
        for (Product p: products ) {
            if(p.getName().equals(paraProduct.getName())){
                return true;
            }
        }
        return false;
    }

}




