import java.util.*;
class IntegerOrNot{
    public static void main(String args[]){
        System.out.println("Enter any value");
        Scanner r=new Scanner(System.in);
        System.out.println(r.hasNextInt());
        
        if(r.hasNextInt()){
            System.out.println("INTEGER");
        }
        else{
            System.out.println("Not Integer");
            
        }
    }
}