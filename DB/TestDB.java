package DB;

import  java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root"; // Change to your database username
        String password = "kritan123"; // Change to your database password
        //FOR DRIVER
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Connecting to the Database
        Connection conn = DriverManager.getConnection(url, user, password);
        // //Write SQL
        // String sql="insert into user(username,password)values('Sita','c123')";
        // //Create Statement
        // Statement stm= conn.createStatement();
        // //Execute sql
        // stm.execute(sql);
        // //close db
        // conn.close();
        // System.out.println("Success");

        //--------DELETE SQL--------
        // //Writing  the Query
        // String stat="delete from user where id=2;";
        // //Creating a new statement to execute
        // Statement sta=conn.createStatement();
        // //Executing the statement
        // sta.execute(stat);
        // //Closing the connection
        // conn.close();
        // System.out.println("Success");
         
        //-------UPDATE SQL------
        //Writing the Query
        // String Sql="update user set password ='abcd1234' where id=1";
        // Statement state=conn.createStatement();
        // state.execute(Sql);
        // conn.close();
            
        //-------SELECT SQL-----
        //Writing the query
        String SQL="SELECT * FROM user";
        Statement state=conn.createStatement();
        ResultSet rs=state.executeQuery(SQL);
        while(rs.next()){
            System.out.println("ID = "+rs.getInt("id"));
            System.out.println("Username = "+rs.getString("username"));
            System.out.println("Password = "+rs.getString("password"));
        }
        


    }
}
