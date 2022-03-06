package p7;

import java.util.LinkedHashMap;

public class Maps 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		LinkedHashMap<Comparable, String> l1= new LinkedHashMap<Comparable, String>();
		l1.put(0, "apple");
		l1.put(1, "Orange");
		l1.put(2, "Banana");
		l1.put(3, "Fig");
		l1.put(4, "papaya");
		l1.put(5, "lime");
		l1.put(6, "lemon");
		l1.put(7, "Strawberry");
		l1.put("8", "ale");
		l1.put("5", "On");
		l1.put("4", "nana");
		l1.put("0","Watermelon");
		System.out.println(l1);

		
		l1.remove("Fig");
		l1.remove(7);
		System.out.println(l1);
		
		System.out.println(l1.containsValue("Banana"));
		System.out.println(l1.containsValue("apple"));
		
		System.out.println(l1.containsKey(4));
		System.out.println(l1.containsKey("4"));
		
		System.out.println(l1.hashCode());
		System.out.println(l1);
		
		l1.clear();
		System.out.println("CLeared");
	}

}
