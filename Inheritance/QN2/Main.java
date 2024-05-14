package Inheritance.QN2;

public class Main {
    public static void main(String[] args) {
        Employee Emp=new Employee();
        Manager man=new Manager();
        Emp.Name="Ram";
        Emp.Specilization="IT";
        Emp.address="Nepal";
        Emp.age=21;
        Emp.phone=980835051;
        Emp.salary=1234;
        man.Department="IT";
        man.Name="Hari";
        man.address="India";
        man.age=44;
        man.salary=12345;
        man.phone=12324334;
        man.print();
        Emp.print();
    }

}
