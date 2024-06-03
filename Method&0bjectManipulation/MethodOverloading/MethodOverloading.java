package MethodManipulation.MethodOverloading;

public class MethodOverloading {
/*Method overloading in Java means having two or more methods 
(or functions) in a class with the same name and different arguments
 (or parameters). */
 public static void main(String[] args) {
    MethodOverloading a=new MethodOverloading();
    a.Print(1);
    a.Print(1, 2);
 }
 //Example
 void Print(int a){
    System.out.println(a);

 }
 void Print(int a,int b){
    System.out.println(a+","+b);
   
}
}
