package ListsSetsandMapAssignments.Map.TeacherAndStudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TeacherStudentMain {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    Map<StudentList,TeacherList> a=new HashMap<>();
    for(int i=0;i<2;i++){
        StudentList c= new StudentList();
        TeacherList d=new TeacherList();
        //for now only taking name and grade for students and Name and Department for teachers
        System.out.println("Enter the name of the student");
        c.setName(scan.next());
        System.out.println("Enter the grade of the student");
        c.setGrade(scan.nextInt());
        //now for the teacher data
        System.out.println("Enter the name of the teacher");
        d.setName(scan.next());
        System.out.println("Enter the department");
        d.setDepartment(scan.next());
        a.put(c, d);
    }
for(StudentList e: a.keySet()){
    System.out.println(e.getName());
    System.out.println(e.getGrade());
}
scan.close();
}
}
