import java.util.*;
import java.io.*;
public class nullex {
    public static void main(String [] args)
    {
        int a=10;
        try{
            String S=null;
            int s=S.length();
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
    
}
