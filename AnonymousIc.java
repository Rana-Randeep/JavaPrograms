// ANONYMOUS INNER CLASSES
class Popcorn{
    public void taste(){
        System.out.println("SPICY");
    }
}
class AnonymousIc{
    public static void main(String args[]){
        Popcorn p=new Popcorn(){
            public void taste(){
             System.out.println("SALTY");
             
            }
        };
        p.taste();

        Popcorn p1=new Popcorn();
        p1.taste();

        Popcorn p2=new Popcorn(){
            public void taste(){
                System.out.println("SWEET");
            }
        };
        p2.taste();
    

     //IF WE KNOW OBJECT REFERENCE ,HOW TO PRINT CORRESPONDNG CLASS NAME
      System.out.println(p.getClass().getName());
      System.out.println(p1.getClass().getName());
      System.out.println(p2.getClass().getName());
    }
}
