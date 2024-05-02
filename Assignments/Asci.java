package Assignments;
import java.util.Scanner;
public class Asci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number for ascii conversion");
        int num = scan.nextInt();
        if((num<0 && num>128))
        {
            System.out.println("Not in the range");
            return;
        }else{
            char character=(char)num;
            System.out.println(character);
            System.out.println("Git DEMO");

        }
    }

}
