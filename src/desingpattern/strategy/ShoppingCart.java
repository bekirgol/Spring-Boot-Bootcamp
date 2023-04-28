package desingpattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> itemList;

    public void getCart() {
        System.out.println("Your Cart;");
        for (Item item : itemList) {
            System.out.println("Upc Code: " + item.getUpcCode() + ", Price: " + item.getPrice());
        }
        System.out.println("Total Price: " + calculateTotal());
    }

    public ShoppingCart() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public int calculateTotal() {
        int total = 0;
        for (Item item : itemList) {
            total += item.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotal());
    }
}
