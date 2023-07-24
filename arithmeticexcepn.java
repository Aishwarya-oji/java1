import java.util.*;
import java.io.*;
public class arithmeticexcepn {
    public static void main(String [] args)
    {
        int a=10;
        try{
            System.out.println(a/10);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
    
}
