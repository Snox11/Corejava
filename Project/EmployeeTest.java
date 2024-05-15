package Project;

public class EmployeeTest {
    public static void main(String[] args) {
        //instances of Employees
Engineer a=new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
Manager man=new Manager(207,"Barbara Johnson","054-12-2367", 109_501.36,"US Marketing");
Admin admin=new Admin(304,"Bill Munroe", "054-12-2367", 75_002.34);
Director dir=new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
//Printing the employees information
// a.printEmployee();
// man.printEmployee();
// admin.printEmployee();
// dir.printEmployee();
/*Before testing raise salary */
a.printEmployee();
//increasing salary by 1000
a.raiseSalary(1000);
//Changing the name
a.setName("Ram Hari");
//after raising the salary and changing the name
a.printEmployee();
}
}
