package p26;

import java.util.Iterator;
import java.util.LinkedList;

public class SingleLinkedList 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		int a=10;
		LinkedList<String> l1=new LinkedList<String>();
		
		l1.add("May");
		l1.add("June");
		l1.add("July");
		l1.add("August");
		l1.add("April");
		l1.add("November");
		System.out.println(l1);
		 
		l1.addLast("December");
		System.out.println(l1);
		
		l1.addFirst("January");
		System.out.println(l1);
		
		l1.add(2,"March");
		l1.add(1,"Febuary");
		l1.add(8,"September");
		l1.add(9,"October");
		System.out.println(l1);
		
		
		
		@SuppressWarnings("rawtypes")
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println("The Month is "+itr.next());
		}
		System.out.println(l1); 
		
		System.out.println(l1.getFirst()+" "+l1.getLast());
		System.out.println(l1.remove("January"));
		System.out.println(l1);
		System.out.println(l1.contains("Winter"));
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
	}
}
