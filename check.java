// GIVEN N ARRAY ELEMENTS , CHECK IF THERE EXISTS A PAIR(I,J) SUCH THAT ARR[I]+ARR[J]==K AND I::J {I AND J ARE INDEX VALUE}

import java.util.*;
class check{
  public static void main(String args[]){
    Scanner we=new Scanner(System.in);
    System.out.println("enter length");
    int l=we.nextInt();


    int[]arr=new int[l];
    System.out.println("enter elements");
    for(int i=0;i<l;i++){
      arr[i]=we.nextInt();
    }


    System.out.println("enter sum value");
    int k=we.nextInt();


    int flag=0;
    for(int i=0;i<l-1;i++){
      for(int j=i+1;j<=l-1;j++){

        if(arr[i]+arr[j]==k){
          System.out.println("Sum of values at position "+(i+1)+" and "+(j+1)+ " is equal to "+ k);
          flag=1;
        }
      }
        
    }
    
    if(flag==0){
      System.out.println("no such pair exist");
    }

  }
}
