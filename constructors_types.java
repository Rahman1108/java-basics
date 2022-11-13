import java.lang.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        
        java obj_1 = new java("Rahman",533);
        java obj_2 = new java(obj_1);
        java obj_3 = new java();
        
        System.out.println("Details of object_1");
        obj_1.display();
        System.out.println("Details of object_2");
        obj_2.display();
        System.out.println("Details of object_3");
        obj_3.display();
    }
}
class java{
    public String name;
    public int rollno;
    
    public java(String n,int x){
        name = n;
        rollno = x;
    }
    
    public java(java obj){
        name = obj.name;
        rollno = obj.rollno;
    }
    
    public java(){
        String a="bharath";
        int b=533;
        name = a;
        rollno=b;
    }
    
    public void display(){
        System.out.println("Name : "+name+"\tRoll no :"+rollno);
    }
}