package Basic.Array;
import java.util.Scanner;
import java.util.Arrays;
public class Arraywithmethod {
    /*Array with method
    1>array as argument
     * void sum(int a[]){
     * 
     * }
     * 2> array as return type :
     * int get50Intvalue(){
     * 
     * //array=321,21,2,12,12
     * return array;
     * }
     */
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int a[] = new int[10]; 
   // for(int i=0;i<10;i++){
     //   System.out.println("Enter a value");
       // a[i]=scan.nextInt();
    //}
int d[]=new int[10];
d=test();
System.out.println(Arrays.toString(d));
int b[]=new int[10];

String country[]=new String[4];
for(int i=0;i<4;i++){
    System.out.println("Enter the name of the country");
    country[i]=scan.nextLine();
}
//printcountry(country);
scan.close();
}
static void sum(int a[]){
    int s=0;
    for(int i=0;i<10;i++){
        s=s+a[i];
    }
System.out.println("The sum is "+s);
}
static int[] test(){
    int a[]=new int[10];
    Scanner scan=new Scanner(System.in);
    for(int i=0;i<10;i++){
        System.out.println("Enter a number");
a[i]=scan.nextInt();
scan.close();
    }
    return a;
}
static void printcountry(String a[]){
for(int i=0;i<4;i++){
    System.out.println(a[i]);
}
}
}
