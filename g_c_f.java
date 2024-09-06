// WRITE A FUNCTION THAT CALCULATES THE GREATEST COMMON DIVISOR OF 2 NUMBERS

import java.util.*;
class g_c_f{

    // USER DEFINED FUNCTION
    public static void gcfcalculation(int a ,int b){
      while(a!=b){
        if(a>b){
            a=a-b;
        }
        else{
            b=b-a;
        }
      }
      System.out.println(a);
    }
    
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS FOR CALCULATING THE GREATEST COMMON FACTOR BETWEEN THEM");
        int a=we.nextInt();
        int b=we.nextInt();
        gcfcalculation(a,b);
    }
}