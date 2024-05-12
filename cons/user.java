package cons;

public class user {
    String User_name;
    String password;
    //--------default constructor---------
    user(){
        User_name="Root";
        password="123";
    }
    void printuser(){
        System.out.println("User name = "+User_name);
        System.out.println("Password = "+password);
    }
//---parameterized constructor
user(String User_name,String password){
    this.User_name=User_name;
    this.password=password;
}
user(String User_name){
    this.User_name=User_name;
}
public static void main(String[] args) {
    user u=new user("Kritan","1234");
u.printuser();
}
}
