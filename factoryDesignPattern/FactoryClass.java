package factoryDesignPattern;

public class FactoryClass {
    public static Bank createAccount(int ch)
    {
        if (ch == 1)
            return new SavingAccount();
        else if (ch == 2)
            return new LoanAccount();

        return null ;
    }
}
