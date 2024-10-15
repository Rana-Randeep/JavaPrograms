class FinalKeyword{
    public void m1(){
        int x=10;
        class Inner{
         public void m2(){
            System.out.println(x);
         }
        }
        Inner in=new Inner();
        in.m2();
    }
    public static void main(String args[]){
        FinalKeyword o=new FinalKeyword();
        o.m1();
    }
}

// BEFORE JAVA 8 : THIS PROGRAM WILL NOT RUN UNTIL WE USE "final" KEYWORD BEFORE INT -> final int x=10;
//LOCAL VARIABLE WILL WE BE CREATED WHILE EXECUTING m1,ONCE m1 method COMPLETE LOCAL VARIABLE WILL BE DESTROYED