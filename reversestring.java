import java.util.*;
class reversestring{
    public static void main(String args[]){
        
     Scanner we=new Scanner(System.in);
System.out.println("ENTER NAME");
String name=we.nextLine();
StringBuilder sb=new StringBuilder(name);
for(int i=0;i<sb.length()/2;i++){

int front=i;
int back=sb.length()-1-i;

char frontchar=sb.charAt(front);
char backchar=sb.charAt(back);

    sb.setCharAt(front,backchar);
    sb.setCharAt(back,frontchar);


}
System.out.println(sb);
    }
}