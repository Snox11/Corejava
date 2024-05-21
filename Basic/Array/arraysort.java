package Basic.Array;

import java.util.Arrays;

public class arraysort {
public static void main(String[] args) {
    
    int[] a={1,78,3,4,5};
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    for(int i=a.length-1;i>=0;i--){
        System.out.print(a[i]+" ");

    }

}
    

}
