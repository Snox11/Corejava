package Inheritance.Qn3;

public class Rectangle {
int length;
int breadth;
Rectangle(int length,int breadth){
    this.length=length;
    this.breadth=breadth; 
}
void Printarea(){
    if(length==breadth){
        System.out.println("The area of the square is "+(length*breadth));
    }else{
    System.out.println("The area of the rectangle is "+(length*breadth));}
}
void PrintPerimeter(){
    if(length==breadth){
        System.out.println("The Perimeter of the square is "+((length+breadth)*2));

    }
    System.out.println("The Perimeter of the rectangle is "+((length+breadth)*2));
}
}
