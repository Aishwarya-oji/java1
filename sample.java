
import java.util.*;
public class sample {
    public static void main(String []args){
        int count=0;
        Scanner s=new Scanner(System.in);
        String p;
        p=s.next();
        p=p.toLowerCase();
        for(int i=0;i<p.length();i++)
        {
            if(p.charAt(i)=='a'||p.charAt(i)=='e'||p.charAt(i)=='i'||p.charAt(i)=='o'||p.charAt(i)=='u')
            count++;
        }
        System.out.println("count of vowels:"+count);
        }
    
}
