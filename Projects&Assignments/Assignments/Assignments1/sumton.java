package Assignments.Assignments1;
import java.util.Scanner;
public class sumton {
    public static void main(String[] args) {
        int a=input();
int res =processing(a);
System.out.println("The sum to nth number is "+res);

        
    }
    public static int input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();   
        scan.close();     
        return a;
    }
    static int processing(int a){
if(a==1)
{
return a;
}else{
    return a+processing(a-1);
}

    }

}
