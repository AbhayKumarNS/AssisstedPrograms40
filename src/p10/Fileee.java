package p10;

import java.io.*;
import java.util.regex.*;

public class Fileee 
{
	public static void main(String[] args) throws IOException
	{
		try 
		{
			FileWriter writer = new FileWriter("test.txt");
			writer.write("Writing in the test file!");
			writer.close();
			System.out.println("Successfully wrote to the file.\n");
		}
 
		catch (IOException e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		@SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(new FileReader("test.txt"));
		
		Pattern pattern = Pattern.compile("[A-Za-z][a-z]+");

		System.out.println("Matched Content:");
		String line;
		while ((line = read.readLine()) != null) 
		{
			Matcher match = pattern.matcher(line);
			while (match.find()) 
			{
				int start = match.start(0);
				int end = match.end(0);
				System.out.println(	line.substring(start, end));
			}
		}
	}
}

