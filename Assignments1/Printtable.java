package Assignments1;
import java.util.Scanner;
public class Printtable {
public static void main(String[] args) {
    int a=input();
print(a);
    
}
static int input(){
    System.out.println("Enter the number for table");
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    scan.close();
    return a;

}
static void print(int a){
    for(int i=1;i<=10;i++){
        System.out.println(i+"x"+a+"="+(i*a));
    }
}
}
