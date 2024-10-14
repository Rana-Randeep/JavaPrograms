//DIFFERENCE BETWEEN DECLARING INSIDE STATIC AND INSTANCE METHOD 

class MethodLocal2{
    int x=10;
    static int y=20;
    public void m1(){
        class Inner{
            public void m2(){
                System.out.println(x);
                System.out.println(y);
            }
        }
        Inner i=new Inner();
        i.m2();
    }
    public static void main(String args[]){
      MethodLocal2 o=new MethodLocal2();
      o.m1();
    }
} 

//I DECLARE INNER CLASS INSIDE INSTANCE METHOD(m1)

// FROM INSTANCE AREA  -> WE CAN ACCESS BOTH - 1) INSTANCE VARIABLE ; 2) STATIC VARIABLE

//BUT IF m1 METHOD IS STATIC : public static void m1(); then
      //from static area -> you can't access instance variable
         // therefore output for S.O.P(x) -> WILL BE ->" CE:COMPILED ERROR, non static variable cannot be referenced from a static context "
  