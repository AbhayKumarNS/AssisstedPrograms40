package p21;

import java.io.*;

class Fileee 
{
	public static void appendStrToFile(String fileName,String str)
	{
		try 
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
			out.write(str);
			out.close();
		}
		catch (IOException e)
		{
			System.out.println("exception occurred" + e);
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		String fileName = "Geek.txt";
		try 
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Hello World:\n");
			out.close();
		}
		catch (IOException e) 
		{
			System.out.println("Exception Occurred" + e);
		}
		String str = "This is GeeksforGeeks";
		appendStrToFile(fileName, str);

		
		try {
			@SuppressWarnings("resource")
			BufferedReader in = new BufferedReader(	new FileReader("Geek.txt"));
			String mystring;

			while ((mystring = in.readLine()) != null) 
			{
				System.out.println(mystring);
			}
		}
		catch (IOException e) 
		{
			System.out.println("Exception Occurred" + e);
		}
	}
}
