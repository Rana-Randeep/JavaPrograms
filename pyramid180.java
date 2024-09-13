// INVERTED HALF PYRAMID ROTATED BY 180 DEGREE
import java.util.*;
class pyramid180{
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);

        System.out.println("ENTER NO. OF LINE");
        int n=we.nextInt();
        
        System.out.println("YOUR PYRAMID");
        for (int i=1;i<=n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}