import java.lang.*;
import java.util.*;

class Main{
    public static void main(String args[]){
    thiskeyword1 obj_1 = new thiskeyword1();
    thiskeyword2 obj_2 = new thiskeyword2(2,3,4);
    int x=obj_2.volume();
    System.out.println("First example for this keyword : ");
    obj_1.display();
    System.out.println("Second example for this keyword : ");
    System.out.println("2*3*4 :"+x);
    System.out.println("object address : "+obj_2);
    }
}
class thiskeyword1{
    public int x = 10;
    public void display(){
        int x=20;
        System.out.println("Value of x without this : "+x);
        System.out.println("Value of x with this : "+this.x);
    }
}
class thiskeyword2{
    int l,b,h;
    thiskeyword2(int l,int b,int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public int volume(){
        return l*b*h;
    } 
}