package OOP.OOPs;

public class Studentmain {
public static void main(String[] args) {
    Student a=new Student();
    a.name="Sam";
    a.address="California";
    a.phone_number=980835051;
a.roll_no=1;
a.print(a.roll_no, a.name, a.phone_number, a.address);
Student b=new Student();
b.address="Dallas";
b.name="John";
b.roll_no=101;
b.phone_number=923232323;
b.print(b.roll_no, b.name, b.phone_number, b.address);
}
}
