package Project;

public class Director extends Manager {
    Director(int empid,String name ,String ssn,double salary,String deptName,double budget){
       super(empid, name, ssn, salary, deptName);
    }
private double budget;
public double getBudget() {
    return budget;
}
public void setBudget(double budget) {
    this.budget = budget;
}

}
