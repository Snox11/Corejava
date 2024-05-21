package Basic.Array;

import java.util.Scanner;

public class MultiDarray {
/*Multi dimensional array
#used to manage data in row and column
Syntax:
data_type[][] array_name = new data_type[row][col];
 * 
 * 
 * 
 */
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int mat[][]=new int[2][2];
    //Write data in array
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++)
        {
            mat[i][j]=scan.nextInt();
        }
    }
// read form matrix
for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
System.out.print(mat[i][j]+" ");

    }
    System.err.println();
}
scan.close();
}
}
