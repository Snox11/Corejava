package OOPs;

public class AreaMain {
    public static void main(String[] args) {
        Area a=new Area();
        a.setDim();
       int print= a.getArea(a.length, a.breadth);
       System.out.println("The area is "+print);

    }

}
