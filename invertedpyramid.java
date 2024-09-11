import java.util.*;
class invertedpyramid{
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        System.out.println("enter no.of lines to form inverted pyramid");
        int n=we.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}