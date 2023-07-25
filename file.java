import java.io.*;
class file
{
	public static void main(String args[])
	{
		File fp=new File("C:file.java");
		if(fp.exists())
			System.out.println("File created successfully");
	}
}