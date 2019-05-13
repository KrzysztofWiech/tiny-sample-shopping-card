package SpringBootApplication.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ShoppingCard {

    private List<Product> productList;

    public ShoppingCard() {
        this.productList = new ArrayList<Product>();
    }

    public void addProductToShoppingCard(Product product) {
        productList.add(product);
    }

    @Override
    public String toString() {
        return "ShoppingCard{" +
                "productList=" + productList +
                '}';
    }
}
