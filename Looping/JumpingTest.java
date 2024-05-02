package Looping;

public class JumpingTest {
    /*
     * Jumping Statements
     * a>break; :exit from loop
     * b>continue; :skip calues
     * c>return; : exit form method
     */
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5 || i==8)
            {
                //break;
                //continue;
            return;
            }
            System.out.println(i);
        }
        System.out.println("End of the loop");
    }

}
