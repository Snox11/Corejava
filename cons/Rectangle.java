package cons;

public class Rectangle {
    int l;
    int b;
    Rectangle(int a,int b){
l=a;
this.b=b;
    }
void Area(){
    int area=l*b;
    System.out.println("The area of "+l+" and "+b+" is "+area);
}
}
