package desingpattern.proxy;

public class DebitCardProxy implements BankAccount {
    @Override
    public void debit() {
        System.out.println("debit for DebitCardProxy");
    }
    public SavingAccount savingAccount() {
        return new SavingAccount();
    }
}
