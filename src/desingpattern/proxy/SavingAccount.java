package desingpattern.proxy;

public class SavingAccount implements BankAccount {
    DebitCardProxy debitCardProxy;
    @Override
    public void debit() {
        debitCardProxy.savingAccount();
    }
}
