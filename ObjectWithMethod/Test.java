package ObjectWithMethod;

public class Test {

    public static void main(String[] args) {
        Student s= new Student();
        s.setId(1);
        s.setAge(20);
        s.setFname("Ram");
        s.setLname("Hari");
        s.setCollege("Khwopa");
        Test t =new Test();
        t.print(s);
        
    }
    // Object as a parameter
    void print(Student s){
        System.out.println("Id="+s.getId());
        System.out.println("First name="+s.getFname());
        System.out.println("Last name="+s.getLname());
        System.out.println("College="+s.getCollege());
        System.out.println("Age="+s.getAge());
    }
}
