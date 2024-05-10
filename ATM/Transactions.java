package ATM;
/*
 * Giving code 1 for inquiry
 * 2 for balance after deposit 
 * 3 for balance after withdraw
 * So that it is easier to know what to print
 */
import java.util.Scanner;

public class Transactions {
void balance_withdraw(){
    Screen display=new Screen();
    Scanner scan = new Scanner(System.in);
    Account a=new Account();
    System.out.println("Enter the amount you want to withdraw");
    int with=scan.nextInt();
    a.available_balance=a.total_balance-with;
    display.display_balance(a.available_balance,3);

}
void balance_inquiry(){
    Account a=new Account();
    Screen display=new Screen();
    a.available_balance=a.total_balance;
    display.display_balance(a.available_balance, 1);
 
    }
    
    void deposit(){
        Screen display=new Screen();
        Scanner scan=new Scanner(System.in);
        Account a=new Account();
        System.out.println("Enter the amount to deposit");
        int deposit_amt=scan.nextInt();
        a.available_balance=deposit_amt+a.total_balance;
        display.display_balance(a.available_balance, 2);
        
    }
}
