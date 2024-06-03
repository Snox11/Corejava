package com.service;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService{
    static List<Product> pList = new ArrayList<>();

    @Override
    public void addProduct(Product p) {
        String url="jdbc:mysql://localhost:3306/Product";
        String user="root";
        String pass="kritan123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // get connection
            Connection con=DriverManager.getConnection(url, user, pass);
            //Sql query
            String sql="insert into Productdb(name,price,company)values('"+p.getName()+"','"+p.getPrice()+"','"+p.getCompany()+"')";
            Statement state=con.createStatement();
            state.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // pList.add(p);
        // System.out.println("Added success fully -------Size="+pList.size());

    }

    @Override
    public void deleteProduct(int id) {
// pList.remove(index);
// System.out.println("removed Succcesfully");
String url="jdbc:mysql://localhost:3306/Product";
String user="root";
String pass="kritan123";

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    // get connection
    Connection con=DriverManager.getConnection(url, user, pass);
    //Sql query
    String sql="delete from Productdb where id ='"+id+"'";
    Statement state=con.createStatement();
    state.execute(sql);
} catch (Exception e) {
    e.printStackTrace();
}
   System.out.println("Deleted the data of user with id = "+ id);
    }

    @Override
    public List<Product> getAllproducts() {
        String url="jdbc:mysql://localhost:3306/Product";
String user="root";
String pass="kritan123";

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    // get connection
    Connection con=DriverManager.getConnection(url, user, pass);
    //Sql query
    String sql="select * from Productdb";
    Statement state=con.createStatement();
    ResultSet rs=state.executeQuery(sql);
    while(rs.next()){
        System.out.println("id = "+rs.getInt("id"));
        System.out.println("Name = "+rs.getString("name"));
        System.out.println("Company ="+rs.getString("Company"));
        System.out.println("Price ="+rs.getString("Price"));
    }

} catch (Exception e) {
    e.printStackTrace();
}

return pList;
    }

}
