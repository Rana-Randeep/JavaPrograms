//TOPIC - 1) NESTED CLASS
class Outer{
    class Inner{
        public void show(){
            System.out.println("NESTED CLASS");
        }
    }
}
class nested{
    public static void main(String args[]){

        // HOW INNER CLASS OBJECT IS CREATED INSIDE MAIN
        Outer.Inner we=new Outer().new Inner();
        we.show();
    }
}