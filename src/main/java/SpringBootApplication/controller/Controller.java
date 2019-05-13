package SpringBootApplication.controller;


import SpringBootApplication.model.Shop;

import SpringBootApplication.model.ShoppingCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    Shop shop;
    @Autowired
    ShoppingCard shoppingCard;

    @RequestMapping("/hello")
    public String hello() {
        return "Works? ";
    }

    @RequestMapping("/products")
    public String products() {
        return shop.purchase();
    }
}
