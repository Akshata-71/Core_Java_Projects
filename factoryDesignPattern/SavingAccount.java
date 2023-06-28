package factoryDesignPattern;

public class SavingAccount implements  Bank{
    private double balance ;

    @Override
    public void deposit(double amt) {
        balance += amt;
        System.out.println(amt + " DEPOSIT SUCCESSFULLY !!");
    }

    @Override
    public void withdraw(double amt) {
        if (amt<=balance) {
            balance -= amt;
            System.out.println(amt + " WITHDRAW SUCCESSFULLY !!");
        }else{
            System.err.println("INSUFFICIENT BALANCE !!");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("THE BANK BALANCE IS "+ balance);
    }
}
