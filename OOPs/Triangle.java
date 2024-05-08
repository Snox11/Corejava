package OOPs;
import java.lang.Math;
public class Triangle {
    double area(int a ,int b ,int c,double perimeter){
        //to find area we need to find perimeter √[s(s-a)(s-b)(s-c)] s is perimeter
        double prearea=(perimeter)*(perimeter-a)*(perimeter-b)*(perimeter-c);
      double  area= Math.sqrt(prearea);

        return area;
    }
    double perimeter(int a,int b,int c){
int peri;
peri=(a+b+c)/2;

        return peri;
    }

}
