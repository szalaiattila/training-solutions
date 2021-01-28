package week05d04;

import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate expireDate;


    public Product(String paraName, int paraYear, int paraMonth, int paraDay) {
         this.name = paraName;
         this.expireDate = LocalDate.of(paraYear, paraMonth, paraDay);
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public boolean isExpired() {
        if(expireDate.isBefore(LocalDate.now())) {
            return  true;
        }
        return false;
    }
}
