// FROM REGULAR OR NORMAL INNER CLASS , WE CAN ACCESS BOTH STATIC AND NON STATIC MEMBERS OF OUTER CLASS DIRECTLY

class outer4{
    int x=10;
    static int y=20;

    class inner{
        public void m1(){
         System.out.println(x);
         System.out.println(y);
        }
    }
    public static void main(String args[]){
        outer4.inner i=new outer4(). new inner();
        i.m1();

    }
}