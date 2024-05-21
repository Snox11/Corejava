package Assignments.Assignments1;
import java.util.Scanner;
/*Write a program to create the equivalent of a four-function calculator. The program to
enter two integer’s numbers and an operator. It then carries out the specified arithmetic operator
operation: addition, subtraction, multiplication or division of the two numbers. Finally, it displays
the result */
public class Calculator {
    private static int count=0;
    public static void main(String[] args) {
        System.out.println("Enter the first number (A)");
        int i=take_data();
        System.out.println("Enter the second number(B)");
        int j=take_data();
        int menu=menu();
        switch (menu) {
            case 1:
            add(i, j);
                break;
                case 2:
sub(i, j);
                break;
                case 3:
                Multiply( i, j);

                break;
                case 4:
Divide(i, j);
                break;
                case 5:
                return ;
            default:

                break;
        }


        
    }
    static int take_data(){
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        return i;
    }
    static int menu(){
        System.out.print("\033c");
        if(count==0){
            System.out.println("\t CALCULATOR\n1.ADD\n2.SUBTRACT\n3.Multiply\n4.Divide\n5.Exit");
        }else{
            System.out.println("Please Enter between 1 and 4 According to the menu");
            System.out.println("\t CALCULATOR\n1.ADD\n2.SUBTRACT\n3.Multiply\n4.Divide\n");
        }
        
        int a=0;
        a=take_data();
        if(a<0 || a>5) {       
menu();
        } 
        return a;
    }
    static void add(int a,int b){
        int c=a+b;
        System.out.print("\033c");
System.out.println("The sum is "+c);
    }
    static void sub(int a,int b){
        int c=a-b;
        System.out.print("\033c");
        System.out.println("First number - Second Number = "+c);

    }
static void Multiply(int a, int b){
    int c=a*b;
    System.out.print("\033c");
System.out.println("The multiplication of two numbers is ="+c);

}
static void Divide(int a,int b){
    int c=a/b;
    System.out.print("\033c");
    System.out.println("A/B ="+c);

}
}
