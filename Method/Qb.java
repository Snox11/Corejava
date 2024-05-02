package Method;
/*  SI and Amount using following methods:
   *      a> input
   *      b> processing
   *      c> output   
 */
import java.util.Scanner;
public class Qb {
  public static void main(String[] args) {
    System.out.println("Enter principle");
    int p=input();
    System.out.println("Enter Rate");
    int r=input();
    System.out.println("Enter Time");
    int t=input();
    System.out.println("Choose an option \n 1)Simple Interest \n 2)Amount");
    int a=input();
    while((a<1 || a>2)==true)
    {
      System.out.println("Enter again");
      a=input();
    }
    processing(a, p, t, r);
  }
  static void processing(int a,int p,int t,int r){
    if(a==1){
      //Simple interest
      int si=(p*t*r)/100;
      output(si, a);

    }else{
      //Amount
      int amt=p*(1+r*t);
      output(amt, amt);

    }
  }
  static int input(){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    return a;
  }
static void output(int out,int a){
  if(a==1){
System.out.println("The SI is "+out);
  }else{
    System.out.println("The Amount is "+out);
  }
}
}
