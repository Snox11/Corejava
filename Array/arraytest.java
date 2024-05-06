package Array;
import java.util.Scanner;
public class arraytest {
    
 //store and print age of 5 students
 public static void main(String[] args) {
    int age[] =new int[5];
Scanner scan=new Scanner(System.in);
for(int i=0;i<5;i++){
    System.out.println("Enter the age");
    age[i]=scan.nextInt();

}
for(int i=0;i<5;i++){
    System.out.println(age[i]);
}
scan.close();
 }
}
