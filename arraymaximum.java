import java.util.*;
class arraymaximum{
   
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);

        System.out.println("ENTER SIZE OF AN ARRAY");
        int n=we.nextInt();

        System.out.println("ENTER ELEMENTS ");
        int[] arr=new int[n]; // CREATING AN ARRAY IN JAVA
        for(int i=0;i<n;i++){
            arr[i]=we.nextInt();
        }

        //int max=0;
         int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("MAXIMA FROM THIS ARRAY IS "+max);




        //WHAT IF YOUR ARRAY CONTAIN NEGATIVE INTEGERS. FOR Eg: {-10,-20,-30,-40};
      
        System.out.println(" ENTER SIZE");
        int m=we.nextInt();

        System.out.println("ENTER NEGATIVE ELEMENTS FOR AN ARRAY ");
        int[] arrr=new int[m]; // CREATING AN ARRAY IN JAVA
        for(int i=0;i<m;i++){
            arrr[i]=we.nextInt();
        }
        
        int maxx=arrr[0];  // YOU CAN ALSO USE 
        for(int i=0;i<m;i++){
            if(maxx<arrr[i]){
                maxx=arrr[i];
            }
        }
        System.out.println("MAXIMA FROM THIS ARRAY IS "+maxx);
    }
}