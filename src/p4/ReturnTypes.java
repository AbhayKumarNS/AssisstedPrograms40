package p4;

public class ReturnTypes 
{
	public static int Abc()
	{
		int x='a';
		return x;
	}
	public static double Dob()
	{
		double y=31.101;
		return y;
	}
	public static float Flo()
	{
		float z=1002.23f;
		return z;
	}
	public static String Sti()
	{
		String s="OKKKKKK";
		return s;
	}
	public static char Cha()
	{
		char c='N';
		return c;
	}
public static void main(String[] args) 
{
	int a= Abc();
	System.out.println(a);
	
	double b=Flo();
	System.out.println(b);
	
	String d=Sti();
	System.out.println(d);
	
	char e=Cha();
	System.out.println(e);
}
}
