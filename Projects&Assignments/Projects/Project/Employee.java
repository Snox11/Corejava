package Projects.Project;

import java.text.NumberFormat;

public class Employee {
    private String name;
private int empid;
private String ssn;
private double salary;
public void setSalary(double salary) {
    this.salary = salary;
}
Employee(int empid,String name, String ssn, double salary){
    this.empid=empid;
    this.ssn=ssn;
    this.salary=salary;
    this.name=name;
} 

public void raiseSalary(double increase){
this.salary=salary+increase;
}
void printEmployee(){
    NumberFormat.getCurrencyInstance().format(salary);
    getSalary();
    //Need to code to print 
System.out.println("Id ="+empid); 
System.out.println("Name ="+name);
System.out.println("SSN ="+ssn);
System.out.println("Salary ="+salary);}
//setter for name
public void setName(String name) {
    this.name = name;
}
/*Getters for Name,empid,ssn and salary */
public String getName() {
    return name;
}
public int getEmpid() {
    return empid;
}
public String getSsn() {
    return ssn;
}
public double getSalary() {
    return salary;
}

}

