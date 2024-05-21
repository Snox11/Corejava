package OOP.Inheritance.QN2;

public class Employee extends Members {
    String Specilization;
    void print(){
        printSalary();
        super.print();
        System.out.println("Specialization ="+Specilization);
    }
}
