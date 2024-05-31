package comservice;
import commodel.Product;
public class ProductIMPL implements ProductServices{

    @Override
    public void addProduct(Product p) {
        // TODO Auto-generated method stub
a.add(p.getCompany());
    System.out.println("Added Success");
    }

    @Override
    public void deleteProduct(int index) {
        // TODO Auto-generated method stub
       a.remove(index);
       System.out.println("removed succesfully");
    }

    @Override
    public void getALL() {

    
    }

}
