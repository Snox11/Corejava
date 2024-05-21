package ObjectWithMethod;
public class BookMain {
    public static void main(String[] args) {
        BookMain t=new BookMain();
        t.print_data();
    }
    Book getData(){
        Book b= new Book();
        b.setAuthor("J.K Rowling");
        b.setName("Harry Potter");
        b.setPrice(1999);
        b.setPublishied_date(2001);
        return b;
    }
    void print_data(){
        Book a=new Book();
        a=getData();
        System.out.println("The name of the author = "+a.getAuthor());
        System.out.println("The name of the book = "+a.getName());
        System.out.println("The price of the book = "+a.getPrice());
        System.out.println("The publishing date of the book = "+a.getPublishied_date());
    }
    

}
