package Aggregation;

public class Test {
public static void main(String[] args) {
    Car c=new Car();
    c.setColor("Red");
c.setCompany("Honda");
c.setPrice(10000000);
c.setModel("VM9999");
Employee emp=new Employee();
emp.setId(11);
emp.setName("Ram Hari");
emp.setPost("Doctor");
emp.setCar(c);
System.out.println("Id ="+emp.getId());
System.out.println("Name ="+emp.getName());
System.out.println("Salary ="+emp.getSalary());
System.out.println("-------Car info-------");
System.out.println("Color ="+emp.getCar().getColor());
System.out.println("Model ="+emp.getCar().getModel());
System.out.println("Company ="+emp.getCar().getCompany());
}
}
