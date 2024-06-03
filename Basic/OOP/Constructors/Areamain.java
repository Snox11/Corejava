package Basic.OOP.Constructors;

import java.util.Scanner;

public class Areamain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length");
        int q=scan.nextInt();
        System.out.println("Enter the breadth");
        int w=scan.nextInt();

        Area a=new Area(q, w);
       int area= a.returnArea();
       System.out.println("The area is "+area);
        scan.close();
    }

}
