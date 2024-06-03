package Basic.ListsSetsandMapAssignments.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StudentsData a[]=new StudentsData[5];
        for(int i=0;i<5;i++){
            StudentsData b =new StudentsData();
            System.out.println("Enter your name");
            b.setName(scan.next());
            System.out.println("Enter grade");
            b.setGrade(scan.nextInt());
            System.out.println("Enter the roll");
            b.setRoll(scan.nextInt());
            a[i]=b;
        }
        List<StudentsData> list=new LinkedList<>();
        for(int i=0;i<5;i++){
            list.add(a[i]);

        }
for(StudentsData s: list){
    System.out.println(s.getName());
}
scan.close();

    }

}
