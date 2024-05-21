package Basic.Array;
public class Q3 {
public static void main(String[] args) {
   int odd[]=new int[50];
   int count=0;
   for(int i=1;i<=100;i++){
    if(i%2 != 0)
    {
        odd[count]=i;
        count++;
    }
   }
   for(int i=0;i<50;i++){
System.out.println(odd[i]);
   }
}
}
