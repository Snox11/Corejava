package Basic.Method;

public class ChangeStaticValue {
    static String college="Trichandra";
    int rol;
String nam;
    ChangeStaticValue(int a,String name){
      rol=a;
      nam=name;
    }
static void change(){
    college="Ram";
}
void Print(){
    System.out.println(college +"  "+nam+"  "+rol);
}
public static void main(String[] args) {
ChangeStaticValue s1=new ChangeStaticValue(0, "Ram");
s1.Print();
ChangeStaticValue.change();
ChangeStaticValue s2=new ChangeStaticValue(1, "Shyam");
s2.Print();
ChangeStaticValue s3=new ChangeStaticValue(2, "Gram");
s3.Print();

}

}
