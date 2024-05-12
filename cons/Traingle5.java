package cons;
/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a
class named 'Triangle' with constructor having the three sides as its parameters. */
public class Traingle5 {
    int a;
    int b;
    int c;
    Traingle5(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void Traingle(){
        double perimeter=(a+b+c)/2;
        System.out.println("The perimeter is "+perimeter);
        double prearea=(perimeter)*(perimeter-a)*(perimeter-b)*(perimeter-c);
        double  area= Math.sqrt(prearea);
System.out.println("The area is "+area);
    }

}
