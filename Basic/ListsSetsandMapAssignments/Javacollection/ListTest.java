
package Basic.ListsSetsandMapAssignments.Javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
// List<String> list = new ArrayList<>();
List<String> list =new LinkedList<>();
list.add("Nepal");
list.add("China");
list.add("Korea");
list.add("Japan");
list.add("India");
list.remove(2);
for(String s:list){
    System.out.println(s);
}
    }

}
