// Implementing 2D array with by default values with 4*4 matrix

public class Test2 {
public static void main(String args[]){
    int rows =4;
    int column=4;
    int [][] arr=new int[rows][column];
    int value=1;

    for(int i=0;i<rows;i++){
        for(int j=0;j<column;j++){
            arr[i][j]=value;
            value++;
        }
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<column;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
}
