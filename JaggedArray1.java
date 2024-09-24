import java.util.Scanner;
public class JaggedArray1 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int [][] jag=new int[3][];
       jag [0]=new int[2];
       jag [1]=new int[3];
        jag[2]=new int[4];

        System.out.println("Enter 9  values in jagged array");

        for(int i=0;i<jag.length;i++){
            for(int j=0;j<jag[i].length;j++){
                 jag[i][j]=scan.nextInt();
            }
        }
        System.out.println("here is your jagged array");

        for(int i=0;i<jag.length;i++){
            for(int j=0;j<jag[i].length;j++){
                System.out.print(jag[i][j]+" ");
            }
            System.out.println();
        }

    }
}
