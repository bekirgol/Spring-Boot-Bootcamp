package desingpattern.proxy;

public class ProxyClient {
    public static void main(String[] args) {
        BankAccount debitCardProxy = new DebitCardProxy();
        debitCardProxy.debit();
    }
}
