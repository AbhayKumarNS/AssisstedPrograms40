package p40;

public class Member_inner 
{
	@SuppressWarnings("unused")
	private int data=30;
	void display()
	{
			System.out.println("This is inside Outer Class");
	}
	class Inner
	{
		private int data=20;
		void msg()
		{
				Member_inner.this.display();
				System.out.println("Data is "+ data);
		}
		void display()
		{
				System.out.println("This is inside Inner Class");
		}
	}
	
	public static void main(String[] args) 
	{
		Member_inner obj= new Member_inner();
		
		Member_inner.Inner in= obj.new Inner();
		in.msg();
		in.display();
	}
}

