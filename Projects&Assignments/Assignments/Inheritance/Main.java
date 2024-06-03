package Assignments.Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Square a[]=new Square[10];
        int i=0;
while(i<10){
    int d=side();
a[i]=new Square(d);
a[i].printArea();
a[i].print_peri();
}
       
}
    static int side(){
        System.out.println("Enter the side ");
        Scanner scan = new Scanner(System.in);
        int c=scan.nextInt();
        return c;


    }

}
