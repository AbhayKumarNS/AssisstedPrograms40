package p17;

class Shaadi 
{
	static void submit() throws Shaadi_Exception
	{
		int age=17;
		if(age>=21)
		{
			System.out.println("Happy Life");
		}
		else 
		{
			throw new Shaadi_Exception();
		}
	}
	
	public static void main(String[] args) 
	{
	try
	{
		submit();
	}
	catch(Shaadi_Exception e)
	{
		System.out.println(e.getMessage());
	}
}
	
}