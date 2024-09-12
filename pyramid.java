import java.util.*;
class pyramid{
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        System.out.println("enter no.of lines to form pyramid");
        int n=we.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
               System.out.print("*");
            }
            for(int k=0;k<n;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}