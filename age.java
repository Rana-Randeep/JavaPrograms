import java.util.*;
class age{
    public static void main(String args[]){
     Scanner we=new Scanner(System.in);
     System.out.println("enter your age"); 
     int life=we.nextInt();
        if(life>18){
         System.out.println("eligible for vote");
        }
        else{
         System.out.println("not eligible for vote");
        }
    }
}