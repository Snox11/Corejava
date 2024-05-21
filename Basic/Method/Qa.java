package Basic.Method;
/*getArea :
   *       ->  pass l and b as parameters
   *       ->  calculate area
   *       ->  return area
   *       ->  call this method in main
   *   b> volume :
   *      -> pass area and h as param
   *      -> calculate volume
   *      -> print area
   *      -> print volume
   *      -> call this method in main    

 */
import java.util.Scanner;
public class Qa {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length");
        int l=scan.nextInt();
        System.out.println("Enter the breadth");
        int b=scan.nextInt();
        int area= getArea(l, b);
        System.out.println("Enter the height");
        int height=scan.nextInt();
        volume(area, height);
        
   }
static int getArea(int l, int b){
    int area = l*b;
    return area;
}
static void volume(int area,int h){
    int volume=area*h;
    System.out.println("The area is "+area);
    System.out.println("The volume is "+volume);

}
}
