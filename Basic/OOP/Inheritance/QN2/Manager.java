package Basic.OOP.Inheritance.QN2;

public class Manager extends Members{
    String Department;
void print(){
    printSalary();
    super.print();
    System.out.println("Department ="+Department);
}

}
