//STATIC NESTED CLASS l
class StaticNc{
    static class Inner{
        public void m1(){
         System.out.println("STATIC NESTED CLASS METHOD");
        }
    }
    public static void main(String args[]){
        Inner p=new Inner();
        p.m1();
    }
}

