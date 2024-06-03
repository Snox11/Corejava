package Basic.ListsSetsandMapAssignments.Map.PasswordandUSernam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PassAndUserMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Map<String,Integer> map= new HashMap<>();
        for(int i=0;i<2;i++){
            UserName a=new UserName();
            System.out.println("Enter the Username ");
            a.setName(scan.next());
            Password b=new Password();
            System.out.println("Enter the password");
            b.setPassword(scan.nextInt());
            map.put(a.getName(), b.getPassword());
        }
        for(String a:map.keySet()){
            System.out.println(a);
        }       
        scan.close();
    }

}
