import java.util.*;
class array{
   
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        System.out.println("ENTER SIZE OF AN ARRAY");
        int n=we.nextInt();
        System.out.println("ENTER ELEMENTS ");
        int[] arr=new int[n]; // CREATING AN ARRAY IN JAVA
        for(int i=0;i<5;i++){
            arr[i]=we.nextInt();
 }

for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("LENGTH OF YOUR ARRAY IS "+arr.length);  // HOW TO PRINT LENGTH OF AN ARRAY IN JAVA

// INITIALISATION WAY 2
  int[] num={1,3,5,7,9};
  System.out.println("2nd ARRAY IS ");
  for(int i=0;i<5;i++){
    System.out.print(num[i]+" ");

  }
  System.out.println();
        System.out.println("LENGTH OF YOUR ARRAY IS "+num.length);
    }
}