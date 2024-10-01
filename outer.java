// CASE -1 ACCESSING INNER CLASS CODE FROM STATIC AREA OF OUTER CLASS

class outer{
    class inner{
        public void m1(){
            System.out.println("INNER METHOD");
        }
    }
    public static void main(String args[]){
      outer.inner in=new outer().new inner();   //1                                                                     
       /* YOU CAN ALSO WRITE CODE OF MARKING 1 IN FOLLOWING 2 STEPS:-  "outer o=new outer();                                 //2
        outer.inner n=o.new inner();"*/
      in.m1();                                                                                                          

      // IN PLACE  OF, CODE WRITTEIN IN MARKING 1 and 2 , YOU CAN WRITE IT AS :- new outer().new inner().m1();
    }    
}