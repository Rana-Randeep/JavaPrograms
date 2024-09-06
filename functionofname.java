// WRITE A FUNCTION TO PRINT THE NAME
import java.util.*;
class functionofname{
    public static void printname(String s){
        System.out.print(s);
        return;
    }
    public static void main(String args[]){
      Scanner we=new Scanner(System.in);
      System.out.println("enter your name");
      String a=we.next();  // String a=we.nextLine();
      printname(a);   //CALLING FUNCTION
    }
}