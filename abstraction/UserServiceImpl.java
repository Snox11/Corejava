package abstraction;

public class UserServiceImpl implements UserService,CommonService {

    @Override
    public void addUser() {
        System.out.println("added Succesfully");
    }

    @Override
    public void deleteUser() {
     System.out.println("Delete sucess");
    }
    @Override
    public void print() {
        System.out.println("......Printing");
    }


}
