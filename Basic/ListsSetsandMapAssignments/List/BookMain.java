package Basic.ListsSetsandMapAssignments.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<BookData> list=new LinkedList<>();
        BookData a[]=new BookData[2];
        for(int i=0;i<a.length;i++){
            BookData b=new BookData();
            System.out.println("Enter the name of the Author");
            b.setAuthor(scan.next());
            System.out.println("Enter the name of the book");
            b.setName(scan.next());
            System.out.println("Enter the price");
            b.setPrice(scan.nextInt());
            list.add(b);
        }
       for(BookData c:list){
        System.out.println(c.getAuthor());
        System.out.println(c.getName());
        System.out.println(c.getPrice());
       }
        
        
    }

}
