package ATM;

import java.util.Scanner;

public class ATM {

    void displaySwitch(){
        Transactions c=new Transactions();
 Scanner scan=new Scanner(System.in);
        System.out.println("\tATM [Press the number for your purpose]\n1)Balance Inquiry\n2)Withdrawal\n3)Deposit");
        int a=scan.nextInt();
        switch (a) {
            case 1:
                c.balance_inquiry();
                break;
        case 2:
        c.balance_withdraw();
            default:
        case 3:
        c.deposit();
         break;

    }
}

}
