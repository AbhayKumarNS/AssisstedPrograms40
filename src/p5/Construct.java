package p5;
class Geek 
{
	int num;
	int id;
	String name;
	Geek() 
	{ 
		System.out.println("Constructor called"); 
	}
	Geek(String name, int id)
	{
	      this.name = name;
	      this.id = id;
    }
}

class Construct 
{
	public static void main(String[] args)
	{
		Geek geek1 = new Geek();
		System.out.println(geek1.name);
		System.out.println(geek1.num);
		
		Geek geek2 = new Geek("AK", 23);
		System.out.println(geek2.name);
		System.out.println(geek2.id);
	}
}


