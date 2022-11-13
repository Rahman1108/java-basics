import java.lang.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        swap obj = new swap();
        int x=10,y=20;
        //x = Integer.parseInt(args[0]);
        //y = Integer.parseInt(args[1]);
        System.out.println("Values after Swaping : ");
        System.out.println("values of x : "+x+"value of Y : "+y);
        obj.swap(x,y);
    }
}
class swap {
    public int temp;
    public void swap(int x,int y){
        temp = x;
        x = y;
        y = temp;
        System.out.println("Values after Swaping : ");
        System.out.println("values of x : "+x+"value of Y : "+y);
    }
}