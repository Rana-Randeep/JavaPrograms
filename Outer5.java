// WITHIN THE INNER CLASS "this" ALWAYS REFERS CURRENT INNER CLASS OBJECT
// IF WE WANT TO REFER CURRENT OUTER CLASS OBJECT , WE HAVE TO USE "Outerclassname.this",

class Outer5{
    int x=10;
    class inner{
        int x=100;
        public void m1(){
            int x=1000;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(inner.this.x);
            System.out.println(Outer5.this.x);
             
        }
    }
    public static void main(String args[]){
        Outer5.inner y=new Outer5().new inner();
        y.m1();
    }
}