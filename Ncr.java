// MAKE FUNCTION TO CALCULATE NCR
import java.util.*;
class Ncr{
    public static int fact(int n){
        int ans=1;
        for(int i=n;i>=2;i--){
            ans=ans*i;
            
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner we= new Scanner(System.in);
        
        System.out.println("ENTER 'N' AND 'R' VALUE TO CALCULATE NCR");
        int n=we.nextInt();
        int r=we.nextInt();
        int a=fact(n)/(fact(n-r)*fact(r));
        System.out.println(a);
    }
}