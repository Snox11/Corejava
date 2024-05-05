package Method;
/*  SI and Amount using following methods:
   *      a> input
   *      b> processing
   *      c> output   
 */
import java.util.Scanner;
public class Qb {
  static int count=0;
  public static void main(String[] args) {
input();
}

  static void processing(int a,int p,int t,int r){
    if(a==1){
      //Simple interest
      int si=(p*t*r)/100;
      output(si, a);

    }else{
      //Amount
      int amt=p*(1+r*t);
      output(amt, a);

    }
  }
  static void input(){
    Scanner scan=new Scanner(System.in);
    int a,p,t,r;
    
      System.out.println("Enter Principle");
       p=scan.nextInt();
      System.out.println("Enter Time");
       t=scan.nextInt();
      System.out.println("Enter rate");
       r=scan.nextInt();
      System.out.println("\tCHOOSE NUMBER\t\n1.Simple Interest\n2.Amount");
       a=scan.nextInt();
       while((a<1 || a>2)==true)
    {
      System.out.println("Enter again");
      a=scan.nextInt();
    }
    scan.close();
    processing(a, p, t, r);
  }
 
    
    
  
static void output(int out,int a){
  if(a==1){
System.out.println("The SI is "+out);
  }else{
    System.out.println("The Amount is "+out);
  }
}
}
