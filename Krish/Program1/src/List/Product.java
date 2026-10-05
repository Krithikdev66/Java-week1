package List;

import java.util.ArrayList;

public class Product {
    int productId,productPrice;
    String productName;

    public int getProductId() {
        return productId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public Product(int productId, int productPrice, String productName) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productName = productName;
    }
}
