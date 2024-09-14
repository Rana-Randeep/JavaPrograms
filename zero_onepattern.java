// PRINT 0-1 PATTERN
import java.util.*;
class zero_onepattern{
    public static void main(String args[]){
    Scanner we=new Scanner(System.in);
    System.out.println("ENTER NO. OF LINES TO PRINT PATTERN");
    int n=we.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
}
}