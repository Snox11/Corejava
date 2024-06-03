package Basic.OOP.OOPs;
import java.util.Scanner;

public class nameandroll {
int roll;
String name;
void get_name(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a name ");
    name=scan.next();
}
void get_roll(){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a roll no");
roll=scan.nextInt();
}
void print(){
System.out.println("The name is "+name);
System.out.println("The roll no is "+roll );
}
}
