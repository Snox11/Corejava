package Assignments.Assignments1;
import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        int a=input();
       int result = factorial(a);
print(result);        
    }
static  int input(){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number for factorial");
int a=scan.nextInt();
scan.close();
    return a;

}
static int factorial(int a){
if(a>=1){
    return factorial(a-1)*a;
}
else{
    return 1;
}
}
static void print(int result){
    System.out.println("The factorial is "+result);
}
}