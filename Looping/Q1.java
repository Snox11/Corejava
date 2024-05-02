package Looping;
import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=scanner.nextInt();

    int i=a;
    int temp=0;
while(i<=a/2 ){
    if(a%2==0){
        temp++;
    }
i++;
}    
if(temp==0){
    System.out.println("The number "+a+" is a prime number");
}

}
}
