package ATM;

import java.util.Scanner;

public class Screen {

boolean display_verification(){
    Scanner scan=new Scanner(System.in);
    Account d=new Account();
    System.out.println("Enter the Account number ");
    int a=scan.nextInt();
    System.out.println(a);
    System.out.println("The acc  no"+d.Account_num);
    System.out.println("Enter the pin");
    System.out.println("The pin  no"+d.pin);
    int b=scan.nextInt();
if(a==d.Account_num)
{
    if(b==d.pin){
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
