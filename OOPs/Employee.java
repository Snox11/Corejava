package OOPs;

import java.util.Scanner;

public class Employee {
String name;
int year_of_joining;
int salary;
String address;
void input(){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the name of employee  ");
name=scan.next();
System.out.println("Enter the year of joining of employee  ");
year_of_joining=scan.nextInt();
System.out.println("Enter the Salary of employee ");
salary=scan.nextInt();
System.out.println("Enter the address of employee  ");
address=scan.next();
}
void print(){
   
    System.out.println(name+"\t"+year_of_joining+"\t\t"+address);
}
}
