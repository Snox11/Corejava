package Looping;

public class DoWhile {
    /*
     * do-while
     * do{
     * }while(condition);
     * 
     * 
     * 
     */
public static void main(String[] args) {
    int a=1;
    int mul=8;
    int multi;
    do{
        multi=mul*a;
        System.out.println(mul+"*"+a+"="+multi);
        a++;
    }while(a<=10);


    
}
}
