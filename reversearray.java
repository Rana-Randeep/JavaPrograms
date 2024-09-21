
import java.util.*;
class reversearray{
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE");
        int l=we.nextInt();

        int[] arr=new int[l];
        System.out.println("ENTER ELEMENTS");
        for(int i=0;i<l;i++){
            arr[i] =we.nextInt();
        }

        int ep=l-1;  //or ep=arr.length-1;
        int i=0;
        while(i<=ep){
            int temp=arr[i];
            arr[i]=arr[ep];
            arr[ep]=temp;
            i++;
            ep--;
        }
        for(int j=0;j<l;j++){
            System.out.print(arr[j]+" ");
        }
    }
} 