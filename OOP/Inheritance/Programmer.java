package OOP.Inheritance;

public class Programmer extends Employee {
    String Programming_lan;
    String Project;
    int bonous;
    void print(){
  
        System.out.println("Programming Language ="+ Programming_lan);
        System.out.println("Bonous ="+ bonous);
        System.out.println("Salary ="+ Salary);
        System.out.println("Project ="+ Project);
      super.print();
    }

}
