import java.lang.*;
import java.util.*;

class third_level_inheritance{
    public static void main(String args[   ]){
        mid1 obj_1 = new mid1();
        mid2 obj_2 = new mid2();
    
        obj_1.set_student("Rahman",533);
        obj_1.set_mid1(90,99);
        obj_2.set_student("Bharath",533);
        obj_2.set_mid2(80,89);
        
        obj_1.show_student();
        obj_1.show_mid1();
        
        obj_2.show_student();
        obj_2.show_mid2();
        
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
class mid1 extends student {
    public int fm1,fm2;
    public void set_mid1(int x1,int x2){
        fm1 = x1;
        fm2 = x2;
    }
    public void show_mid1(){
        System.out.println("M1 : "+ fm1 +"\nM2 :"+fm2);
    }
}
class mid2 extends student {
    public int sm1,sm2;
    public void set_mid2(int x1,int x2){
        sm1 = x1;
        sm2 = x2;
    }
    public void show_mid2(){
        System.out.println("M1 : "+ sm1 +"\nM2 :"+sm2);
    }
}
