 //SUM OF VALUES STORED IN AN AARAY

import java.util.*;
class arraysum{
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);

        System.out.println("ENTER YOUR FIVE SUBJECTS SCORE");
        int[] arr=new int[5]; //initialising an array to score marks
        for(int i=0;i<5;i++){
            arr[i]=we.nextInt();  // taking input and storing into an array
        }

        int sum=0;
        for(int i=0;i<5;i++){
            sum+=arr[i];   // addition of marks
        }

        System.out.println("YOUR TOTAL SCORE IS "+ sum);
    }
}