import java.util.*;
class hollowrectangle{
    public static void main(String args[]){
        Scanner we=new Scanner (System.in);
        System.out.println("enter length of rectangle");
        int length=we.nextInt();

        System.out.println("enter breadth of rectangle");
        int breath=we.nextInt();

        System.out.println("HERE IS YOUR HOLLOW RECTANGLE");
        
        for(int i=0;i<length;i++){
            for(int j=0;j<breath;j++){
                if(i==0 || j==(breath-1) || i==(length-1) || j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}