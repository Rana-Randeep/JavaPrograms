//TOPIC - 2) METHOD LOCAL INNER CLASSSES

class Outer{
    void OuterMethod(){
        System.out.println("INSIDE OUTER METHOD");
    
     class Inner{
            void InnerMethod(){
             System.out.println("INSIDE INNER METHOD");
            }
        }
        Inner y=new Inner();
        y.InnerMethod();
    }
}

class MethodLocal{
    public static void main(String args[]){
        Outer x=new Outer();
        x.OuterMethod();
    }
}