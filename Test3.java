  // Implementation of 2D array with User input

import java.util.Scanner;
public class Test3 {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter rows");
        int rows=scan.nextInt();

        System.out.println("Enter columns");
        int columns=scan.nextInt();

        int[][] arr=new int[rows][columns];
        System.out.println("ENTER "+ rows*columns + " values in an array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=scan.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
