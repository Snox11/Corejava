package MethodOverriding;

public class Test {
public static void main(String[] args) {
    LaxmiBank lb=new LaxmiBank();
//Static or early binding of object
    lb.getBankName();
    lb.getInterestrate();
    //upcasting 
    CentralBank bank= new PrabhuBank();
    Test n=new Test();
    n.printBankInfo(bank);

}
//late or dynamic binding of object
/*Runtime Polymorphism (Parent class as parameter chalayera Eutai Method 
use garera different child class haru lai chaine methods lai eutai method use garera 
redundancy hatauni)
*/
void printBankInfo(CentralBank cb){
cb.getBankName();
cb.getInterestrate();
}
}
