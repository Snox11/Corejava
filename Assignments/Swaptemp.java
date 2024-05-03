package Assignments;
import java.util.Scanner;
public class Swaptemp {
    public static void main(String[] args) {
        //Swaping usign temp
        Scanner scan=new Scanner(System.in);
        int a=1;
        System.out.println("First number a ="+a);
        int b=0;
System.out.println("Second number b ="+b);
//now swaping  using temp variable
int temp;
temp=a;
a=b;
b=temp;
//now they are swapped
System.out.println("now a ="+a);
System.out.println("now b="+b);

    }

}
