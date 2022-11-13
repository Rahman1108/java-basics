import java.lang.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        System.out.println("Performing function overloading program ");
        int x=10,y=20,z=30;
        double p=46.57,q=78.90;
        sum(x,y);
        sum(x,y,z);
        sum(p,q);
        }
         static void sum(int a,int b){
            System.out.println("this is a function with two orgumrnts : ");
            System.out.println("value of a : "+a+"value of b : "+b);
        }
         static void sum(int d,int e,int f){
            System.out.println("this is a function with three  orgumrnts : ");
            System.out.println("value of a : "+d+"value of b : "+e+"value of c : "+f);
        }
         static void sum(double r,double s){
            System.out.println("this is a function with two orgumrnts : ");
            System.out.println("value of a : "+r+"value of b : "+s);
            
        }
}
