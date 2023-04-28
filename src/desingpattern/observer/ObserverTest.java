package desingpattern.observer;

import java.util.Scanner;

public class ObserverTest {
    public static void main(String[] args) {
        Product asus = new Computer("Asus");
        Product casper = new Computer("Casper");

        Customer bekir = new CustomerImpl("Bekir");
        Customer ahmet = new CustomerImpl("Ahmet");


        bekir.addComment(asus, "Mükemmel bir ürün. Performansı çok iyi");
        bekir.addComment(casper, "deneme");

        casper.subscribe(ahmet);
        casper.subscribe(bekir);
        casper.unsubscribe(bekir);
        asus.subscribe(bekir);
//        casper.addComment("Malzeme kalitesi biraz kötü ama performansı çok iyi tavsiye ederim.");

    }
}
