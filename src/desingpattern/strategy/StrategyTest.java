package desingpattern.strategy;

import java.util.List;

public class StrategyTest {
    public static void main(String[] args) {
        Item mouse = new Item("mouse", 30);
        Item keyboard = new Item("keyboard", 30);
        Item headphone = new Item("headphone", 20);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(mouse);
        shoppingCart.addItem(keyboard);
        shoppingCart.addItem(headphone);
        shoppingCart.removeItem(mouse);

        shoppingCart.getCart();
        System.out.println("*************************************");
        PaymentStrategy creditCard = new CreditCardStrategy("Bekir", "1234 5678", "123", "12/2028");
        PaymentStrategy paypal = new PaypalStrategy("bekirgol@gmail.com", "123456");

        shoppingCart.pay(creditCard);
    }
}
