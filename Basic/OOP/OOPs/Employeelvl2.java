package Basic.OOP.OOPs;

import java.util.Scanner;

public class Employeelvl2 {
    int salary;
    int hours;
    void getInfo(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the salary of the emplopyee");
        salary=scan.nextInt();
        System.out.println("Enter the Number of hours of work per day of the employee");
        hours=scan.nextInt();
    }
    int Addsal(){
        salary=salary+10;
        return salary;
    }
    int AddWork(){
      salary=salary+5;
        return salary;
    }
void print(int a){
    System.out.println("The final salary is $"+a);
}
}
