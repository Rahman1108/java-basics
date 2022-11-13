import java.lang.*;
import java.util.*;

class Multilevel_inheritance{
    public static void main(String args[   ]){
        results obj = new results();
        obj.set_student("Rahman",533);
        obj.show_student();
        obj.set_marks(90,99);
        obj.show_marks();
        obj.show_results();
        System.out.println("Completed");
    }
}
class student{
    public String name;
    public int rollno;
    public void set_student(String n,int x){
        name = n;
        rollno = x;
    }
    public void show_student(){
        System.out.println("Name : "+ name +"\nRoll no :"+rollno);
    }
}
class marks extends student {
    protected int m1,m2;
    public void set_marks(int x1,int x2){
        m1 = x1;
        m2 = x2;
    }
    public void show_marks(){
        System.out.println("M1 : "+ m1 +"\nM2 :"+m2);
    }
}
class results extends marks{
    public int total;
    public float avg;
    public void show_results(){
        total = m1+m2;
        avg = total/2;
        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);
    }
}