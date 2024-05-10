package OOPs;

public class EmployeeMain {
public static void main(String[] args) {
    Employee a=new Employee();
    Employee b=new Employee();
    Employee c=new Employee();
    a.input();
    System.out.println("\tThe details of second employee\n");
    b.input();
    System.out.println("\tThe details of third employee\n");
    c.input();
    System.out.println("Name\tYear of joining\tAddress");
a.print();
b.print();
c.print();
    
}
}
