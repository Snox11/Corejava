package Basic.Array;
import java.util.Scanner;
//WAP to store and print the avg price of 10 books
public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int price[]=new int[10];
for(int i=0;i<10;i++){
    System.out.println("Enter the price of the book");
    price[i]=scan.nextInt();
}
for(int i=0;i<10;i++){
    System.out.println("The price are "+price[i]);
}

scan.close();        
    }
    

}
