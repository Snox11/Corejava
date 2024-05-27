package ListsSetsandMapAssignments.Map.StateAndPopulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StatePopMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Map<String,Long> a=new HashMap<>();
        for(int i=0;i<2;i++){
            State name=new State();
            StatePOP population=new StatePOP();
            System.out.println("Enter the name of the state");
            name.setStateName(scan.next());
            System.out.println("Enter the population of "+name.getStateName()+"state");
            population.setPopulation(scan.nextLong());
            a.put(name.getStateName(), population.getPopulation());
        }    
    for(String b: a.keySet()){
        System.out.println(b);
    }
        scan.close();
    }
}
