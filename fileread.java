import java.io.*;
import java.util.*;
class fileread
{
	public static void main(String [] args)
	{

	File f=new File("C:fileread.java");
	Scanner s=new Scanner(f);
	while(s.hasNextLine())
	{
		String str=s.nextLine();
		System.out.println(str);
	}
   }
} 