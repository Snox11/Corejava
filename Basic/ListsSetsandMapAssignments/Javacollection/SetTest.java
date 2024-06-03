package Basic.ListsSetsandMapAssignments.Javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set= new LinkedHashSet<>();
        set.add("ram");
        set.add("hari");
        set.add("hari");
        set.add("kamal");
        set.add("anup");
        set.add("ram");
        set.add("bharat");
        for(String s :set){
            System.out.println(s);
        }
    }

}
