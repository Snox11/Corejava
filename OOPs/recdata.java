package OOPs;

import java.util.Scanner;

public class recdata {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Rectangle l=new Rectangle();
        System.out.println("Enter the Length");
        l.length=scan.nextInt();
        System.out.println("Enter the Breadth");
        l.breadth=scan.nextInt();
        int area =l.process_area(l.length,l.breadth);
        l.print(area);
scan.close();
    } 

}
