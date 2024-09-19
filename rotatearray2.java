import java.util.*;
class rotatearray2{
    public static void main(String args[]){

     Scanner we=new Scanner(System.in);
     System.out.println("enter length");
     int l=we.nextInt();


     int[] arr=new int[l];
     System.out.println("enter elements");
        for(int p=0;p<l;p++){
         arr[p]=we.nextInt();
        }


     System.out.println("Enter times rotate");
     int k=we.nextInt();

     int a=k%l;
        if(a!=0){
            for(int q=0;q<(l/2);q++){
             int temp=arr[l-1-q];
             arr[l-1-q]=arr[q];
             arr[q]=temp;
            }
            for(int r=0;r<(k/2);r++){
             int temp=arr[k-1-r];
             arr[k-1-r]=arr[r];
             arr[r]=temp;
            }
            int n=l-k;
            for(int s=0;s<(n/2);s++){
             int temp=arr[k+s];
             arr[k+s]=arr[l-1-s];
             arr[l-1-s]=temp;
            }
        }
        for(int i=0;i<l;i++){
         System.out.print(arr[i]+" ");
        }
    }
}