package OOP.OOPs;

public class Employeelvl2Main {
public static void main(String[] args) {
Employeelvl2 a=new Employeelvl2();
a.getInfo();
int fi=0;
if(a.salary<500){
   fi=a.Addsal();
}
if(a.hours>6)
{
    if(fi==0){
    fi=a.AddWork();
}else{
fi=a.AddWork()+a.Addsal()-a.salary;
}
    
}
a.print(fi);
}
}
