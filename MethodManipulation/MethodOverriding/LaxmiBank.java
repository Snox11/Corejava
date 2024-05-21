package MethodManipulation.MethodOverriding;

public class LaxmiBank extends CentralBank{
    @Override
    void getBankName() {
        // TODO Auto-generated method stub
System.out.println("Laxmi Bank");
    }
@Override
void getInterestrate() {
    // TODO Auto-generated method stub
System.out.println("18%"); 
}
}
