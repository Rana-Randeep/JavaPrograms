import java.util.*;
class string_properties{
public static void main(String args[]){
    
    Scanner we=new Scanner(System.in);
    System.out.println("ENTER YOUR FIRST NAME");
    String firstname=we.next();
    System.out.println("ENTER YOUR LAST NAME");
    String lastname=we.next();

    //CONCATENATION
    
     String fullname=firstname+" "+lastname;
    System.out.println(fullname);     //  ALSO YOU CAN WRITE  System.out.println(firstname+" "+lastname);

    // SIZE OR LENGTH OF YOUR NAME
    System.out.println(fullname.length());
    int b=firstname.length();
    System.out.println(b);

    // print particular character or alphabet from string
    System.out.println(fullname.charAt(5));

    char q=firstname.charAt(2);
    System.out.println(q);

}
}