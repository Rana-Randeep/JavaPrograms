import java.util.Scanner;
public class JaggedArray2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter  number of arrays");
        int numberOfArrays=scan.nextInt();
        int[][] jag=new int[numberOfArrays][];

        for(int i=0;i<numberOfArrays;i++){
            System.out.println("Enter the size of sub-array "+(i+1));
            int sizeOfSubArray=scan.nextInt();
            jag[i]=new int[sizeOfSubArray];
        }

        for(int i=0;i<numberOfArrays;i++){
            if(jag[i].length>1)
                System.out.println("Enter "+jag[i].length+" elements  in sub-array "+ (i+1));
            else
            System.out.println("Enter "+jag[i].length+" element  in sub-array "+ (i+1));

            for(int j=0;j<jag[i].length;j++){
                jag[i][j]=scan.nextInt();
            }
        }

        System.out.println("Jagged Array");
        for(int i=0;i<numberOfArrays;i++){
            for(int j=0;j<jag[i].length;j++){
                System.out.print(jag[i][j]+" ");
            }
            System.out.println();
        }
    }
}
