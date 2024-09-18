// GIVEN N ARRAY ELEMENTS , COUNT TOTAL NO. OF ELEMENTS HAVING ATLEAST 1 ELEMENT GREATER THAN ITSELF 
import java.util.*;
class countmax{
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);

        System.out.println("Enter array length array");
        int l=we.nextInt();

        int[] arr=new int[l];
        System.out.println("enter elements");
        for(int i=0;i<l;i++){
            arr[i]=we.nextInt();
        }

        int max=Integer.MIN_VALUE;
        for(int j=0;j<l;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        
        int count=0;
        for(int k=0;k<l;k++){
            if(arr[k]==max){
             count++;
            }
        }
        int ans=l-count; 
        System.out.println(ans);
    }
}