package Looping;
public class Sum1to100 {

    public static void main(String[] args) {
        int start=1;
        int end =100;
        int sum=0;
        int sumo=0;
        for(;start<=end;start++){
            if(start%2==0){
                sum=start+sum;
            }
            else{
                sumo=start+sumo;

            }
        }
System.out.println("The sum of even numbers is"+sum);
System.out.println("The sum of odd numbers is"+sumo);    }
}
