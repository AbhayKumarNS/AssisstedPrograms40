package p16;

public class ThrowThrowsFinally 
{
	static void fun() throws IllegalAccessException
		{
			System.out.println("Inside fun(). ");
			throw new IllegalAccessException("demo");
		}

public static void main(String args[])
	{
		try 
		{
			fun();
		}
		catch (IllegalAccessException e)
		{
			System.out.println("caught in main.");
		}
		finally 
		{
            System.out.println("I am in final block");
        }
	}
}
	