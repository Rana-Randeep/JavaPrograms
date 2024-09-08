// FLOYD'S TRIANGLE

import java.util.*;
class FloydTriangle{
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        System.out.println("ENTER NO. OF LINE");
        int n=we.nextInt();
        System.out.println("YOUR FLOYD'S TRIANGLE");
        int sum=0;
        for (int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                sum=sum+1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}