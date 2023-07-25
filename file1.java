import java.io.*;
class file1
{
	public static void main(String[] args)
	{
	try{
		File file=new File("C:file1.txt");
		FileWriter fp=new FileWriter(file);
		fp.write("hi how r u");
		fp.close();

		System.out.println(file.getName());
		System.out.println(file.canWrite());
  		System.out.println(file.getAbsolutePath());
	}
	catch (IOException e) {
            e.printStackTrace();
	}
	}
}
