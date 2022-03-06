package p20;

public class InterFace implements Xyz, MyInterface2
{
   public void display() 
   {
      Xyz.super.display();
      MyInterface2.super.display();
   }      
   public static void main(String args[]) 
   {
      InterFace obj = new InterFace();
      obj.display();
   }
}

