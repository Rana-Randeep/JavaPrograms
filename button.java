import java.util.*;
class button{
    public static void main(String args[]){
        System.out.println("enter any number FROM 1,2 and 3");
        Scanner we=new Scanner(System.in);
        int button=we.nextInt();
        if(button==1){
            System.out.println("NAMASTE");
        }
        else if(button==2){
            System.out.println("HELLO");
        }
        else if(button==3){
            System.out.println("BONJOUR");
        }
        else{
            System.out.println("INVALID");
        }
    }
}