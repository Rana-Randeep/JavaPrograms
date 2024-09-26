import java.util.*;
class greeting{
public static void main(String args[]){
    Scanner we=new Scanner(System.in);
    System.out.println("enter a,b and c");
     String button=we.nextLine();
    switch(button){
        case "a":System.out.println("NAMASTE");
        break;
        case "b":System.out.println("HELLO");
        break;
        case "c":System.out.println("BONJOUR");
        break;
        default:System.out.println("invalid alphabet");
        break;
    }
}
}