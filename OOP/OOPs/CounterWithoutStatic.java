package OOP.OOPs;

public class CounterWithoutStatic {
int count=0;
CounterWithoutStatic(){
    count++;
}
private void showcount(){
    System.out.println(count);
}
public static void main(String[] args) {
new CounterWithoutStatic().showcount();
new CounterWithoutStatic().showcount();
new CounterWithoutStatic().showcount();
}
}
