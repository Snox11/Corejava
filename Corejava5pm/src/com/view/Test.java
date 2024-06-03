package com.view;

import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {
public static void main(String[] args) {
getALL();
}
// add product
static void add(){
    ProductService Service=new ProductServiceImpl();
    Scanner scan=new Scanner(System.in);
    char flag='y';
    do{
Product pd=new Product();
System.out.println("Enter name");
pd.setName(scan.next());
System.out.println("Enter price");
pd.setPrice(scan.nextInt());
System.out.println("Enter company");
pd.setCompany(scan.next());
Service.addProduct(pd);
System.out.println("Do you want to add more y for yes");
flag=scan.next().charAt(0);

    }while(flag=='y');
scan.close();


}
static void getALL(){
    ProductService Service=new ProductServiceImpl();
    Service.getAllproducts();
    
}
static void Delete(){
    ProductService service=new ProductServiceImpl();
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the id of the person you want to delete");
    int id=scan.nextInt();
    service.deleteProduct(id);
    scan.close();

}
}
