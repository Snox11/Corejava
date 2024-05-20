package ObjectWithMethod;

public class Test {

    public static void main(String[] args) {      
        Test t =new Test();
        t.print();
        
    }
    // Object as a parameter
    void print(){
        Student s1= new Student();
        s1=getStudentData();
        System.out.println("Id="+s1.getId());
        System.out.println("First name="+s1.getFname());
        System.out.println("Last name="+s1.getLname());
        System.out.println("College="+s1.getCollege());
        System.out.println("Age="+s1.getAge());
    }
    //Object as return type
    Student getStudentData(){
        Student s=new Student();
        s.setId(1);
        s.setAge(20);
        s.setFname("Ram");
        s.setLname("Hari");
        s.setCollege("Khwopa");
        return s;
    }
}
