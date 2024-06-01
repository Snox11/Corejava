package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService{
    static List<Product> pList = new ArrayList<>();

    @Override
    public void addProduct(Product p) {
        pList.add(p);
        System.out.println("Added success fully -------Size="+pList.size());
    }

    @Override
    public void deleteProduct(int index) {
pList.remove(index);
System.out.println("removed Succcesfully");
    }

    @Override
    public List<Product> getAllproducts() {
return pList;
    }

}
