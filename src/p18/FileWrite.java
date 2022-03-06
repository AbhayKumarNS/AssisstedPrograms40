package p18;

import java.io.*;

public class FileWrite 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception 
	{
		File f1=new File("D://Java//Assissted Projects//bin//Simplilearn.txt");
		FileWriter fw=new FileWriter(f1);
		fw.write("This is an Assisted Project");
		fw.write("/n");
		fw.write("This is about File Handling");
		fw.flush();
		System.out.println("Data has been inputed into a file");
	}
}
