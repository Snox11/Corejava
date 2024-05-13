package Method;

public class Counterwithstatic {
   static int count;
    Counterwithstatic(){
        count++;
    }
    void showcount(){
        System.out.println(count);
    }
    public static void main(String[] args) {
        new Counterwithstatic().showcount();
        new Counterwithstatic().showcount();
        new Counterwithstatic().showcount();
    }

}
