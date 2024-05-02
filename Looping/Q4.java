package Looping;
import java.util.Scanner;
public class Q4 {
public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
System.out.println("Write the number");
int num=scan.nextInt();
int reverse=0;
while(num!=0){
    int remainder=num%10;
    reverse=reverse*10+remainder;
    num=num/10;
}
System.out.println("The reverse is "+reverse);
    
}
}
