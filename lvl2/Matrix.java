package lvl2;
import java.util.Scanner;
public class Matrix {
    private int rows;
    private int columns;
    int[][] matrix=new int[rows][columns];
    Matrix(int rows , int columns){
        this.rows=rows;
        this.columns=columns;
    }
    int get_rows(){
        System.out.println("Enter the number of rows");
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        scan.close();
        return a;
    }
    int get_columns(){
        System.out.println("Enter the number of columns");
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        scan.close();
        return a;
    }
}
