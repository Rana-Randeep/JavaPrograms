import java.util.*;
class relation{
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        System.out.println("enter value of a");
        int a=we.nextInt();
        System.out.println("enter value of b");
        int b=we.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(b>a){
            System.out.println("a is lesser than b");
        }
        else{
            System.out.println("Both a and b are equal");
        }
    }
}