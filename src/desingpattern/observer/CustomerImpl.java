package desingpattern.observer;

public class CustomerImpl implements Customer {
    private final String name;

    public CustomerImpl(String name) {
        this.name = name;
    }

    @Override
    public void addComment(Product product, String comment) {
        System.out.println(name + " Added new comment for " + product.getBrand() + " product. Comment: " + comment);
    }
}
