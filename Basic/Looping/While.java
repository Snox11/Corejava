package Basic.Looping;

public class While {
    /*
     * -while-loop
     * syntax
     * while(condition){
     * //statements
     * }
     */
public static void main(String[] args) {
    int n=6;
    int fact=1;
while (n>1) {
    fact=fact*n;
n--;
}
System.out.println("The factorial of 6 is"+fact);}
}
