package Basic.ListsSetsandMapAssignments.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DogMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DogData a[]=new DogData[2];
        for(int i=0;i<a.length;i++){
            DogData b=new DogData();
            System.out.println("Enter the name of the dog");
b.setName(scan.next());
System.out.println("Enter the breed");
b.setBreed(scan.next());
System.out.println("Enter the age of the dog");
b.setAge(scan.nextInt());
a[i]=b;
 }        
 List<DogData> list=new LinkedList<>();
 for(int i=0;i<a.length;i++){
    list.add(a[i]);
 }
 for(DogData s:list){
    System.out.println(s.getName());
    System.out.println(s.getBreed());
    System.out.println();
 }
    }

}
