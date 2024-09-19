import java.util.*;
class rotatearray{
  public static void main(String args[]){
    Scanner we=new Scanner(System.in);
    System.out.println("Enter length of an array");
    int l=we.nextInt();

    int[] rotate=new int[l];
    System.out.println("enter elements");

    for(int i=0;i<l;i++){
      rotate[i]=we.nextInt();
    }

    System.out.println("How many times you want to rotate");   

    int k=we.nextInt();

    for(int p=0;p<k;p++){
      int temp=rotate[l-1];
      for(int j=1;j<l;j++){
        rotate[l-j]=rotate[l-(j+1)];
      }
      rotate[0]=temp;
    }
    System.out.println("AFTER ROTATION");
    for(int z=0;z<l;z++){
      System.out.print(rotate[z]+" ");
    }
  }
}