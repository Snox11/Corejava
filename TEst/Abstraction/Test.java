package TEst.Abstraction;

import java.util.Scanner;

public class Test extends UserDesigns{

    @Override
    public void addUser() {
System.out.println("User added");
    }

    @Override
    public void deleteUser() {
System.out.println("User deleted");
    }

    @Override
    public void append_data() {
System.out.println("Data appended");
    }

    @Override
    public int get_num() {
Scanner scan=new Scanner(System.in);
int i=scan.nextInt();        
return i;
    }

    @Override
    public int print_num() {
Scanner scan=new Scanner(System.in);
int i=scan.nextInt();
        return i;
    }

    @Override
    void get_met() {
System.out.println("got a method");
    }

}
