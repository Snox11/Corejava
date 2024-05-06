package Array;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String city[]=new String[6];
        for(int i=0;i<6;i++){
            System.out.println("Enter the name of the city");
            city[i]=scan.nextLine();
        }
        for(int i=0;i<6;i++){
            System.out.println("The name is " + city[i]);
        }
        scan.close();
    }

}
