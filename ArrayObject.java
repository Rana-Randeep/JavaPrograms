                                    // ARRAY AS OBJECT
class Student{
   public int roll_no;
    public String name;
    Student(int rollno , String name){
        this.roll_no=rollno;
        this.name=name;
    }
}

class ArrayObject{
    public static void main(String args[]){
        Student[] arr;

      // allocating memory for 5 objects of type Student
      arr=new Student[5];
      
      arr[0]=new Student(1,"Pallavi");
      arr[1]=new Student(2,"Raaj");
      arr[2]=new Student(3,"Anjali");
      arr[3]=new Student(4,"Sneha");
      arr[4]=new Student(5,"Mansi");    
    

        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i].roll_no+ " -> "+arr[i].name);
        }
    }
}