package factoryDesignPattern;

public class LoanAccount implements Bank{
    private double balance ;

    @Override
    public void deposit(double amt) {
        balance -= amt;
        System.out.println(amt + " DEPOSIT SUCCESSFULLY !!");
    }

    @Override
    public void withdraw(double amt) {

        balance += amt;
        System.out.println(amt + " LOAN PASSED SUCCESSFULLY !!");

    }

    @Override
    public void displayBalance() {
        System.out.println("THE LOAN AMOUNT IS "+ balance);
    }
}
