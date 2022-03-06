package p6;

import java.util.TreeSet;

public class Coll 
{
	public static void main(String[] args) 
	{
		TreeSet<String> l1=new TreeSet<String>();
		l1.add("Java");
		l1.add("C++");
		l1.add("python");
		l1.add("Ruby");	
		System.out.println(l1);
		
		l1.remove("C++");
		l1.remove("Java");
		System.out.println(l1);
		
		l1.add("Kannada");
		l1.add("Sanskrit");
		l1.add("C#");
		System.out.println(l1);
		

		System.out.println(l1.contains("python"));
	}
	
}
