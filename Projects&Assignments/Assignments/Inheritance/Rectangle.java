package Assignments.Inheritance;

public class Rectangle {
    private int length;
    private int breadth;
    Rectangle(int length,int breadth){
        this.breadth=breadth;
        this.length=length;

    }
    void printArea(){
        int area = length*breadth;
        System.out.println("The area is "+area);
    }
    void print_peri(){
        int peri=2*(length+breadth);
        System.out.println("The perimeter is "+peri);
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    

}
