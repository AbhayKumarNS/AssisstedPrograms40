package p20;

interface Xyz
{  
   public static int num = 100;
   public default void display() 
   {
      System.out.println("display method of MyInterface1");
   }
}


interface MyInterface2
{  
   public static int num = 1000;
   public default void display() 
   {
      System.out.println("display method of MyInterface2");
   }
}  
		

