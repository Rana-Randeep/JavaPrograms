import java.util.*;
class subpartreverse{
    public static void main(String args[]){
        Scanner we=new Scanner(System.in);
        System.out.println("ENTER LENGTH ");
        int l=we.nextInt();

        int[] subpart=new int[l];
        System.out.println("ENTER ELEMENTS");
        for(int i=0;i<l;i++){
            subpart[i]=we.nextInt();
        }

        System.out.println("enter starting and ending position of subarray you want  to reverse");
        int sp=we.nextInt(); //sp(starting position)
        int ep=we.nextInt(); //ep(ending position)

        int si=sp-1; // si(starting index)
        int ei=ep-1; // ei(ending index)

        while(si<ei){
            int temp=subpart[si];
            subpart[si]=subpart[ei];
            subpart[ei]=temp;
            si++;
            ei--;
        }
        
        for(int j=0;j<l;j++){
            System.out.print(subpart[j]+" ");
        }
    }
}