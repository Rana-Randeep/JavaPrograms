// STATIC NESTED CLASS - 3

class StaticNc3{
    int x=10;
    static int y=20;

    static class Inner{
      public void m1(){
        System.out.println(y);
       // System.out.println(x); from nested class we can access only static members of outer class directly and we cannot access non static members
      }
    }
    public static void main(String args[]){
        Inner p=new Inner();
        p.m1();
    }
}    