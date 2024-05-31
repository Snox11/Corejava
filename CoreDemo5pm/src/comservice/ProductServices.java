package comservice;

import java.util.LinkedList;
import java.util.List;

import commodel.Product;

public interface ProductServices {
    List<String> a=new LinkedList<>();
public  void addProduct(Product p);
public void deleteProduct(int index);
public void getALL();
}
