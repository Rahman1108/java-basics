// call by value call by reference and address
import java.lang.*;
import java.util.*;

class Main{
    public static void main(String args[]){

    value obj_1 = new value(2,3);
    obj_1.display();

    int nu1=10,nu1=20;
    address obj_2 = new address();
    obj_2.address(nu1,nu2);
    obj_2.display();
    
        
        
    }
}

class value{
    private int a,b;
    public value(int x ,int y){
        a=x;
        b=y;
    }
    public void display(){
        System.out.println("Value of X : "+a+"\tValue of y : "+b);
    }
}

class address{
    public  int r,s;
    public  void address(int &d ,int &f){
        r=&d;
        s=&f;
    }
    public void display(){
        System.out.println("Value of X : "+r+"\tValue of y : "+s);
    }
}
/*
class reference{
    private int a,b;
    public reference(int x ,int y){
        a=x;
        b=y;
    }
    public void display(){
        System.out.println("Value of X : "+x+"\tValue of y : "+y);
    }
}
*/