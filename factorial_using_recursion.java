import java.lang.*;
import java.util.*;

class Main{
    public static void main(String args[   ]){
            factorial obj = new factorial();
            int t = obj.fact(5);
            System.out.println("Factorial of 5 is :  "+t);
    }
}
class factorial {
    public int fact(int x){
        if (x==1){
            return 1;
        }else{
            return x*fact(x-1);
        }
    }
}