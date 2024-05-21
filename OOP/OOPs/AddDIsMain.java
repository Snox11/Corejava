package OOP.OOPs;
public class AddDIsMain {
    public static void main(String[] args) {
        AddDistance a=new AddDistance();
        AddDistance b=new AddDistance();
        a.get_dis();
        int tot1=a.feet*12+a.inch;
        b.get_dis();
        int tot2=b.feet*12+b.inch;
        a.add(tot1, tot2);
        a.print();

    }

}
