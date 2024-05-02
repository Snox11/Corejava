package Looping;
import java.util.Scanner;
//WAP to print prime numbers between given range
public class Q2 {
public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the upper limit");
   int up=scan.nextInt();
   System.out.println("Enter the lower limit");
   int dw=scan.nextInt();
   System.out.println("Prime numbers are:");
for(int i=dw;i<=up;i++)
{
int a=i;
int temp=0;
for(int j=2;j<=a/2;j++){
    if(a%j==0){
        temp++;
        break;
    }
}
if(temp==0 && i!=0){
    System.out.println(a);
}
}   
}

}
