import java.lang.*;
import java.util.*;

class Main{
    public static void main(String args[]){
    sblock obj_1 = new sblock();
    obj_1.display();
    }
}
class sblock{
    private static int x;
    public void display(){
        System.out.println("Value of X : "+x);
    }
    static{
        x=100;
        System.out.println("static block executed first");
    }
}