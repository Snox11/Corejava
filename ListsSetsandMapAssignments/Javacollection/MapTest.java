package ListsSetsandMapAssignments.Javacollection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
public static void main(String[] args) {
    //Subject - marks
    Map<String,Integer> map= new HashMap<>();
    map.put("Nepali",70);
    map.put("Math", 55);
map.put("Chinese", 50);
for(String a: map.keySet()){
    System.out.println(a);

}
}
/*
 * a>Map of username and password.
 * b>Map of District and code.
 * c>Map of States and population.
 * d>Map of teacher name and student list.
 */
}
