package Projects.ATM;
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
    Bank_Database a=new Bank_Database();
    System.out.println("Enter the amount you want to withdraw");
    int with=scan.nextInt();
    a.ac.available_balance=a.ac.total_balance-with;
    display.display_balance(a.ac.available_balance,3);

}
void balance_inquiry(){
    Bank_Database a=new Bank_Database();
    Screen display=new Screen();
    a.ac.available_balance=a.ac.total_balance;
    display.display_balance(a.ac.available_balance, 1);
 
    }
    
    void deposit(){
        Screen display=new Screen();
        Scanner scan=new Scanner(System.in);
        Bank_Database a=new Bank_Database();
        System.out.println("Enter the amount to deposit");
        int deposit_amt=scan.nextInt();
        a.ac.available_balance=deposit_amt+a.ac.total_balance;
        display.display_balance(a.ac.available_balance, 2);
        
    }
}
