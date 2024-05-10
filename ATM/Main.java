package ATM;

public class Main {
    public static void main(String[] args) {
        Screen screen=new Screen();
        ATM a=new ATM();
        
        if(screen.display_verification()==true){
a.displaySwitch();
        }else{
            System.out.println("Invalid login details");
        }
        
    }

}
