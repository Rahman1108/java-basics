import java.lang.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        nonstatic obj_1 = new nonstatic();
        obj_1.display();
        //  show making an error due to non static variables uasage
        //  obj_1.display();
        
    }
}
class nonstatic{
    public static int x=100;
    public int y=200;
    public void display(){
        System.out.println("Value of x: "+ x +"\t value of y :"+ y );
    }
    public static void show(){
        System.out.println("Value of x: "+ x +"\t value of y :"+ y );
    }
}