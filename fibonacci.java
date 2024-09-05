// WRITE A PROGRAM TO PRINT FIBONACCI SERIES OF N TERMS WHERE IS N INPUT BY USER 
import java.util.*;
class Fibonacci{
    public static void fibo(int n){
        int a=0;
        int b=1;
        System.out.println(a+" ");
        if(n>1){
            for(int i=1;i<n;i++){
             System.out.println(b+" ");
             int temp=b;
             b=a+b;
             a=temp;
            }
        }
    }
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        System.out.println("ENTER ANY SMALL NUMBER");
        int n=we.nextInt();
      fibo(n);
    }
}
