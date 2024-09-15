import java.util.*;
class string_builder2{
  public static void main(String args[]){
    StringBuilder sb= new StringBuilder("TONY");
    System.out.println(sb);

    //char at index 1
    System.out.println(sb.charAt(1));

    //set char 
    
    sb.setCharAt(0,'P');  
    System.out.println(sb);

    // insert
    sb.insert(0,'S');
    System.out.println(sb);

    //APPEND
    System.out.println(sb.append("m"));
    
    //LENGTH
    System.out.println(sb.length());
   }
}
