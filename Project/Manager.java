package Project;

public class Manager extends Employee {
    private String deptName;
    Manager(int empid,String name,String ssn,double salary,String deptName){
        super(empid,name,ssn,salary);
    }

public String getDeptName() {
    return deptName;
}

}
