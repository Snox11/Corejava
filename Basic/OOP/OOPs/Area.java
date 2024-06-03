package Basic.OOP.OOPs;

import java.util.Scanner;

/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second
method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered
through keyboard. */
public class Area {
    int length;
    int breadth;
    void setDim(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length");
         length=scan.nextInt();
         System.out.println("Enter the breadth");
         breadth=scan.nextInt();
        scan.close();

    }
    int getArea(int length,int breadth){
        int area=length*breadth;
        return area;
    }

}
