package factoryDesignPattern;
import  java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT ACCOUNT TYPE ");
        System.out.println("1. SAVING ACCOUNT ");
        System.out.println("2. LOAN ACCOUNT ");
        int ch = sc.nextInt();
        Bank b1 = FactoryClass.createAccount(ch);

        for (int i =0 ;;i++)
        {
            System.out.println("--------------------");
            System.out.println("1. DEPOSIT AMOUNT ");
            System.out.println("2. WITHDRAW AMOUNT ");
            System.out.println("3. DISPLAY BALANCE ");
            ch = sc.nextInt();
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            if (ch == 1 )
            {
                System.out.println("ENTER DEPOSIT AMOUNT ");
                double amt = sc.nextDouble();
                b1.deposit(amt);
            }else if (ch == 2){
                System.out.println("ENTER WITHDRAW  AMOUNT ");
                double amt = sc.nextDouble();
                b1.withdraw(amt);
            }else if (ch == 3)
            {
                b1.displayBalance();
            }else
                System.err.println("INVALID CHOICE !!");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        }


    }
}
