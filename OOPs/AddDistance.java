package OOPs;

import java.util.Scanner;

public class AddDistance {
int inch;
int feet;
int final_inch;
void get_dis(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the feet");
    feet=scan.nextInt();
    System.out.println("Enter the inch");
    inch=scan.nextInt();

}
void add(int a,int b){
    final_inch=a+b;
}
void print(){
    System.out.println("Total Distance = "+(final_inch/12)+" Feet "+(final_inch%12)+" Inches");
}
}
