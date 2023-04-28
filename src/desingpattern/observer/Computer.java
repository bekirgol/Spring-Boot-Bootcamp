package desingpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Product {
    private List<Customer> customers;
    private String brand;

    public Computer(String brand) {
        this.brand = brand;
        customers = new ArrayList<>();
    }
    @Override
    public void subscribe(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void unsubscribe(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void addComment(String comment) {
        for(Customer customer : customers) {
            customer.addComment(this, comment);
        }
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
