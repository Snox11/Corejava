package Method;
import java.util.Scanner;

public class Examplemethod {
    public static void main(String[] args) {
        //1.no return type with no arguments
        Scanner scan=new Scanner(System.in);  
       //int sum= getSumof1to100();
       //System.out.println("The sum of 100 numbers = "+sum);
       System.out.println("Enter number 1");
       int a=scan.nextInt();
       System.out.println("Enter Sec number");
       int b=scan.nextInt();
       System.out.println("The smallest values is "+findsmall(a, b));
       
       //area();
        //sum();

    }
    static void area(){
        int a=4;
        int b=5;
        int c=a*b;
        System.out.println("The area is "+c);
    }
static void sum(){
    int a=1;
    int b=2;
    int sum=a+b;
    System.out.println(sum);
}
    //2.no return time with argument
static void Printtable(int n){
    for(int i=1;i<=10;i++){
int mul=i*n;
System.out.println(n+" x "+ i+" = "+mul);
    }
        
}
//return type with no argument
static int getSumof1to100(){
    int sum=0;
    for(int i=1;i<=100;i++){
         sum = sum+i;
    }
    return sum;
}
//returm type with argument
static int findsmall(int a,int b){
    if(a<b){
        return a;
    }
return b;
}
}
