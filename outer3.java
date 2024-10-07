// CASE 3 - ACCESSING INNER CLASS CODE FROM OUTSIDE OF OUTER CLASS
class test{
    class inner{
        public void m1(){
            System.out.println("INNER CLASS METHOD");
        }
    }
}
class outer3 {
    public static void main(String args[]){
        test.inner in=new test().new inner();
        in.m1();
    }
}