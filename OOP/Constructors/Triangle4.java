package OOP.Constructors;
/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a
class named 'Triangle' without any parameter in its constructor. */
public class Triangle4 {
    int a;
    int b;
    int c;
    Triangle4(){
        a=3;
        b=4;
        c=5;
    }
    void Triangle(){
        double perimeter=(a+b+c)/2;
        System.out.println("The perimeter is "+perimeter);
        double prearea=(perimeter)*(perimeter-a)*(perimeter-b)*(perimeter-c);
        double  area= Math.sqrt(prearea);
System.out.println("The area is "+area);
    }


}
