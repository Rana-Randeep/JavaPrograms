// 2ND TYPE OF INNER CLASS - ' METHOD LOCAL INNER CLASS'
class MethodLocalIc{
    public void m1(){
        class Inner{
            public void sum(int x, int y){
             System.out.println("sum: "+ (x+y));
            }
        }
        Inner i=new Inner();
        i.sum(10,20);
        i.sum(100,200);

    }
    
    public static void main(String args[]){
        MethodLocalIc o=new MethodLocalIc();
        o.m1();
    }
}

//m1 is an instance method
//WE CAN DECLARE METHOD LOCAL INNER CLASS INSIDE BOTH STATIC AND INSTANCE METHODS
