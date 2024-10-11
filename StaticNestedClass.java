//TOPIC -  STATIC NESTED CLASS
import java.util.*;
class Outer{
    private  static void OuterMethod(){
        System.out.println("inside outer method");
    }
       static class Inner{
        public static void Display(){
            System.out.println("inside inner class method");
            OuterMethod();
        }
    }
}

class StaticNestedClass{
    public static void main(String args[]){
        Outer.Inner.Display();
    }
}