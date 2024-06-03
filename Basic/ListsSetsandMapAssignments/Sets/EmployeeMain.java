package Basic.ListsSetsandMapAssignments.Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {
    //Basically list but no duplicates
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Set<EmployeeData> set=new HashSet<>();
        
        for(int i=0;i<2;i++){
            EmployeeData a=new EmployeeData();  
            System.out.println("Enter the name of employee");
            a.setName(scan.next());
            System.out.println("Enter the Department");
            a.setDepartment(scan.next());
            System.out.println("Enter the salary of the employee");
            a.setSalary(scan.nextInt());
            System.out.println("Enter Staff_ID");
            a.setStaffId(scan.nextInt());
            set.add(a);
        }
        scan.close();
        for(EmployeeData c: set){
            System.out.println(c.getName());
        }
    }

}
