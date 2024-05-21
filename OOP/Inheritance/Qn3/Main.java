package OOP.Inheritance.Qn3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Square[] a=new Square[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the length of the side of square");
            int b=scan.nextInt();
           a[i]=new Square(b);
a[i].Printarea();
        }
        
        
scan.close();
    }

}
