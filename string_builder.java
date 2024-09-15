// STRINGS IN JAVA ARE IMMUTABLE. THEREFORE WE MAKE -
// STRING BUILDER CLASS

import java.util.*;
class string_builder{
public static void main(String args[]){
    Scanner we=new Scanner(System.in);
    StringBuilder sb= new StringBuilder("TONY");
    System.out.println(sb);
    
    String name="MY NAME IS TONY";
    StringBuilder bs=new StringBuilder(name);
    System.out.println(bs);
}
}