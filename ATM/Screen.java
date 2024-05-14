package ATM;

import java.util.Scanner;

public class Screen {

boolean display_verification(){
    Scanner scan=new Scanner(System.in);
    Bank_Database d=new Bank_Database();
    System.out.println("Enter the Account number ");
    int a=scan.nextInt();
    System.out.println(a);
    System.out.println("The acc  no"+d.ac.Account_num);
    System.out.println("Enter the pin");
    System.out.println("The pin  no"+d.ac.pin);
    int b=scan.nextInt();
if(a==d.ac.Account_num)
{
    if(b==d.ac.pin){
        return true;
    }
}
    return false;
}
void display_balance(int a,int b){
    ATM d=new ATM();
    if(b==1){
        System.out.println("Your balance is "+a);
        d.displaySwitch();
    } 
    if(b==2){
        System.out.println("Your balance after deposit is "+a);
        d.displaySwitch();
    }
    if(b==3){
        System.out.println("Your balance after Withdrawal is "+a);
        d.displaySwitch();
    }
    
}
}
