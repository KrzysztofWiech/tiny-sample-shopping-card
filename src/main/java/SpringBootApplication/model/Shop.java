package SpringBootApplication.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Shop {

    @Autowired
    private ShoppingCard shoppingCard;

    public String purchase() {
        shoppingCard.addProductToShoppingCard(new Product(1, "milk"));
        shoppingCard.addProductToShoppingCard(new Product(2, "cola"));
        shoppingCard.addProductToShoppingCard(new Product(3, "perfume"));
        return shoppingCard.toString();
    }


}
