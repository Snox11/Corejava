package ObjectsManipulation.objectwitharrAY;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Book bok[]=new Book[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            Book book1=new Book();
            System.out.println("Enter the author");
book1.setAuthor(sc.next());
System.out.println("Enter the price");
book1.setPrice(sc.nextInt());
System.out.println("Enter the id");
book1.setId(sc.nextInt());
System.out.println("Enter the name");
book1.setName(sc.next());
bok[i]=book1;
     }
     for(Book bo : bok){
        System.out.println(bo); 
        sum=sum+bo.getPrice();
     }
     System.out.println(sum);
     sc.close();
    }

}
