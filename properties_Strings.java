import java.util.*;
class properties_Strings{
    public static void main(String args[]){
     Scanner we=new Scanner(System.in);

     System.out.println("Enter your name");
     String name=we.nextLine();
    
     System.out.println(name.substring(1,4));

     String naam="my name is kiran";
     String sentence=naam.substring(5);
     System.out.println(sentence);
    }
}