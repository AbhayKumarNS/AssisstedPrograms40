package p18;

import java.io.File;
import java.io.*;

public class FileRead 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{
	File f1=new File("D://Java//Assissted Projects//bin//Simplilearn.txt");
	FileReader fr=new FileReader(f1);
	char[] arr=new char[(int) f1.length()];
	fr.read(arr);
	String s1= new String(arr);
	System.out.println(s1);
	}
}
