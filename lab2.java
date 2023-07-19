import java.io.*;
import java.util.*;
public class lab2  {
    public static void main(String[]args){
        int a[]=new int[10];
        Scanner s=new Scanner(System.in);
        System.out.println("enter the elements:");
        for(int i=0;i<10;i++){
            a[i]=s.nextInt();
        }
        System.out.println("print array:");
        System.out.println("nos. are:");
        for(int j=0;j<10;j++){
            if(j%2==0)
            System.out.print(a[j]+"");
        }
    }
    
}
