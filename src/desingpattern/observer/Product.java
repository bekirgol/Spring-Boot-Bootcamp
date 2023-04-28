package desingpattern.observer;

public interface Product {
    void subscribe(Customer customer);

    void unsubscribe(Customer customer);

    void addComment(String comment);

    String getBrand();
}
