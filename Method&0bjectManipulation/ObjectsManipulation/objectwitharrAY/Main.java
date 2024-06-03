package ObjectsManipulation.objectwitharrAY;

import java.util.Scanner;

/*
	 * Q> WAP to store and print data 
	 *    of 10 Employees(id,name,company,salary,department,post,city):
     * 
	 *    
	 *    a> find total salary of employee.
	 *    b> print employees of IT department.
	 *    c> count employees of Admin department.
	 *    d> count and print employees of particular city.
	 *    e> calculate total salary of particular department.
	 *    f> find highest and lowest salary of employee.
	 */
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Employees emp[]=new Employees[10];
        int total_salary=0;
        int count_admin=0;
        int count_same_city=0;
        int totsalofdep=0;
        //initializing the value to zero works in finding the highest but while in the lowest you need to intialize a value that is present in the array
        int highest=0;
        for(int i=0;i<emp.length;i++){
            Employees em=new Employees();
            System.out.println("Enter the id ");
            em.setId(scan.nextInt());
            System.out.println("Enter the name of the employee");
            em.setName(scan.next());
            System.out.println("Enter the salary of the employee");
            em.setSalary(scan.nextInt());
            System.out.println("Enter the department of the employee");
            em.setDepartment(scan.next());
            System.out.println("Enter the post of the employee");
            em.setPost(scan.next());
            System.out.println("Enter the name of the city");
            em.setCity(scan.next());
            emp[i]=em;
        }
        //Intializing the lowest character here because it is not entered before this loop
        int lowest=emp[0].getSalary();
for(Employees em: emp){
    total_salary=em.getSalary()+total_salary;
    //print employeees of IT department
    if(em.getDepartment().equals("IT")){
        System.out.println(em);
    }
    //count employees of Admin department.
    if(em.getDepartment().equals("Admin")){
        count_admin++;
    }
    //count and print employees of particular city.
    if(em.getCity().equals("Kathmandu")){
count_same_city++;
System.out.println(em);
    }
    //calculate total salary of particular department.
    if(em.getDepartment().equals("IT")){
totsalofdep = em.getSalary()+totsalofdep;
    }
}
for(int i=0;i<=emp.length-1;i++)
{//highest salary
    if(emp[i].getSalary()>highest)
    {
highest=emp[i].getSalary();
    }
    //lowest salary
    if(emp[i].getSalary()<lowest){
        lowest=emp[i].getSalary();
    }
}
System.out.println("Total Salary of department "+totsalofdep);
System.out.println("The highest salary is "+highest);
System.out.println("The lowest salary is "+lowest);

scan.close();
    }

}
