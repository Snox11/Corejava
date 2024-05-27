package ListsSetsandMapAssignments.Map.Disrict;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DIstrictCodeMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Tree maps are sorted
        Map<String,Integer> c=new TreeMap<>();
        for(int i=0;i<2;i++){
            District a=new District();
            DistrictCode b=new DistrictCode();
            System.out.println("Enter the name of the district");
            a.setDisctrict(scan.next());
            System.out.println("Enter the District code");
            b.setCode(scan.nextInt());
            c.put(a.getDisctrict(), b.getCode());
            
        }
    for(String a:c.keySet()){
        System.out.println(a);
    }
    System.out.println("WSL Vim Test")
        scan.close();
    }

}
