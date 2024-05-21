package Basic.Looping;
import java.util.Scanner;
public class primetest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the upper limit");
        int a=scan.nextInt();
        System.out.println("Enter the lower limit");
        int b=scan.nextInt();
        System.out.println("The prime numbers are");
for(int i=b;i<=a;i++)
{
    int temp=0;
    for(int j=2;j<=i/2;j++) {
        if(i%j==0){
        temp++;
        break;
    }      
    }
    if(temp==0 && i!=0){
        System.out.println(i);
    }
}    
    }

}
