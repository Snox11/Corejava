package Basic.Array;
import java.util.Scanner;
public class Q5 {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    //creating array for storing subjects
    String Subjects[]=new String[5];
    // Taking Subject names form user
for(int i=0;i<5;i++){
    System.out.println("Enter the subject name");
    Subjects[i]=scan.next();
}
//creating variable for marks 
int marks[]=new int[5];
//taking marks in each subject
for(int i=0;i<5;i++)
{
    System.out.println("Enter the marks in " + Subjects[i]);
    marks[i]=scan.nextInt();
} 
//calculating total
int sum=0;
for(int i=0;i<5;i++)
{
    sum=sum+marks[i];
}
System.out.println("The total is " + sum);
//calculating percent 
float percent=(sum*100)/500;
System.out.println("The percentage is " + percent);
scan.close();
}
}
