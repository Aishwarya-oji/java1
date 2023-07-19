import java.io.*;
import java.util.*;
class matrix{
    public static void main(String[]args){
        int row=2,columns=2;
        int m1[][] ={{2,2},{3,4}};
        int m2[][] ={{8,6},{10,8}};
        int add[][]=new int[row][columns];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++){

                add[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("sum of matrix:");
        for(int i=0;i<row;i++)
        { 
            System.out.println();
            for(int j=0;j<columns;j++)
            { 
                System.out.print(add[i][j]+" ");
            }
        }
    }
}
