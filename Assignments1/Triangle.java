package Assignments1;
/*Write a Program to accept three sides of triangle and display which kind of triangle is
formed.
 */
import java.util.Scanner;
public class Triangle {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
System.out.println("Enter the 1st side");
int a=scan.nextInt();
System.out.print("\033c");
System.out.println("Enter the second side");
int b=scan.nextInt();
System.out.print("\033c");
System.out.println("Enter the 3rd number");
int c=scan.nextInt();
if(a==b && b==c){
    System.out.println("It is a equal triangle");
}else if(a==b || b==c){
    System.out.println("It is a isosceles triangle");
}else{
    System.out.println("It is a scalene triangle");
}
scan.close();
System.out.println("Test");
}
}
