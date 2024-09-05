import java.util.*;
class FunctionOfAdd{
    public static int printsum(int a, int b){
      
     return(a+b);

        //return (a+b);
    }
    public static void main(String args[])
    {
     Scanner we=new Scanner(System.in);
     System.out.println("ENTER TWO NUMBERS ADD");
     int c=we.nextInt();
     int d=we.nextInt();
     System.out.println(printsum(c,d));
    }
}