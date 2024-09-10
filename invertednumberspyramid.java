// INVERTED HALF PYYRAMID WITH NUMBERS
import java.util.*;
class invertednumberspyramid{
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        System.out.println("ENTER NO. OF LINE");
        int n=we.nextInt();
        System.out.println("YOUR PYRAMID");
        for (int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");            
            }
            System.out.println();
        }
        
    }
}