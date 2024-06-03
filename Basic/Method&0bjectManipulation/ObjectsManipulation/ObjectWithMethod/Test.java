package ObjectsManipulation.ObjectWithMethod;

public class Test {

    public static void main(String[] args) {      
        Test t =new Test();
        Student a[]=new Student[5];
        a=t.get5students();
        t.printALLstu(a);
    }
    // Object as a parameter
    // void print(){
    //     Student s1= new Student();
    //     s1=getStudentData();
    //     System.out.println("Id="+s1.getId());
    //     System.out.println("First name="+s1.getFname());
    //     System.out.println("Last name="+s1.getLname());
    //     System.out.println("College="+s1.getCollege());
    //     System.out.println("Age="+s1.getAge());
    // }
    // //Object as return type
    // Student getStudentData(){
    //     Student s=new Student();
    //     s.setId(1);
    //     s.setAge(20);
    //     s.setFname("Ram");
    //     s.setLname("Hari");
    //     s.setCollege("Khwopa");
    //     return s;
    // }
    Student[] get5students(){
        Student stu[]=new Student[5];
        for(int i=0;i<5;i++){
            stu[i]=new Student();
            stu[i].setId(1);
            stu[i].setAge(20);
            stu[i].setFname("Ram");
            stu[i].setLname("Hari");
            stu[i].setCollege("Khwopa");
        }
        return stu;
    }
    void printALLstu(Student[] s1){
        for(int i=0;i<5;i++){
            System.out.println("Id="+s1[i].getId());
        System.out.println("First name="+s1[i].getFname());
        System.out.println("Last name="+s1[i].getLname());
        System.out.println("College="+s1[i].getCollege());
        System.out.println("Age="+s1[i].getAge());

        }


    }
}
