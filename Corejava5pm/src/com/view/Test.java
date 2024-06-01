package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {
public static void main(String[] args) {
    add();
    getALL();
    Delete();
    //show after deletion
    getALL();
    
}
// add product
static void add(){
    ProductService Service=new ProductServiceImpl();
    Scanner scan=new Scanner(System.in);
    char flag='y';
    do{
Product pd=new Product();
System.out.println("Enter id");
pd.setId(scan.nextInt());
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
    List<Product> plist=Service.getAllproducts();
    System.out.println(plist);
}
static void Delete(){
    ProductService service=new ProductServiceImpl();
    service.deleteProduct(0);
}
}
