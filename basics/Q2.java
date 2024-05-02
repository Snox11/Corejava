package basics;
import java.util.Scanner;
public class Q2 {
public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter 1st number");
    int num1 = scanner.nextInt();
    System.out.println("Enter 2nd number");
int num2=scanner.nextInt();
System.out.println("Enter the symbol");
String sym=scanner.next();
int print;
switch(sym){
    case "+":
    print=num1+num2;
    System.out.println("Sum = "+print);        
        break;
case "-":
print=num1-num2;
System.out.println("1st num-2nd num = "+print);
break;
case "*":
print=num1*num2;
System.out.println("The multiplication is "+print);
break;
case "/":
print=num1/num2;
System.out.println("1st number divided by 2nd number is "+print);
break;
    default:
        break;
}
}
}
