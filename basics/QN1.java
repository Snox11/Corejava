package basics;
import java.util.Scanner;
public class QN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String post;
System.out.println("Enter your post");
post=scanner.nextLine().toUpperCase();
int MDsal=230000;
int CEOsal=250000;
int MANAGERsal=176000;
int HELPERsal=145900;
double totalsal;



        switch (post) {
            case "MD":
            totalsal=(MDsal*0.2)+MDsal;
                System.out.println("Salary after bonous is"+totalsal);
                break;
                case "CEO":
                totalsal=(CEOsal*0.2)+CEOsal;
                System.out.println("Salary after bonous is"+totalsal);
                break;
                case "MANAGER":
                totalsal=(MANAGERsal*0.2)+MANAGERsal;
                System.out.println("Salary after bonous is"+totalsal);
                break;
                case "HELPER":totalsal=(HELPERsal*0.2)+HELPERsal;
                System.out.println("Salary after bonous is"+totalsal);
                break;
        
            default:
                break;
        }
    }

}
