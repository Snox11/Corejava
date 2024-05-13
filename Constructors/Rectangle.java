package Constructors;

public class Rectangle {
   static int l;
    int b;
    Rectangle(int a,int b){
l=a;
this.b=b;
    }
void Area(){
    int area=l*b;
    System.out.println("The area of length"+l+" and breadth "+b+" is "+area);
}
}
