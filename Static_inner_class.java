import java.lang.*;
import java.util.*;

class Main{
    public static void main(String args[]){
    outer obj_1 = new outer();
    obj_1.test();
    }
}
class outer{
    public static int x = 10;
    public void test(){
        inner obj_2 = new inner();
        obj_2.display();
    }
    static class inner {
        public static void display(){
            System.out.println("Value of X in inner class : "+ x);
        }
    }
}