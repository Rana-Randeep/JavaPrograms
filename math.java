import java.util.Scanner;
class math{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any no.");
        int n=scan.nextInt();
        if(n%2==0){
            System.out.println("EVEN NO.");
        }
        else{
            System.out.println("ODD NO.");
        }
    }
}