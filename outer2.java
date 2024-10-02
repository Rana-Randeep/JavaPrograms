// CASE 2 ACCESSING INNER CLASS CODE FROM INSTANCE AREA OF OUTER CLASS
class outer2{
    class inner{
        public void m1(){
            System.out.println("INNER CLASS METHOD");
        }
    }
    public void m2(){
        inner y=new inner();
        y.m1();
    }
    
    public static void main(String args[]){
        outer2 x=new outer2();
        x.m2();
    }
}
