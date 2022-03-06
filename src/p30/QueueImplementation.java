package p30;

import p30.Queueee;

public class QueueImplementation 
{
	  public static void main(String[] args) {   
	      // Create a queue of capacity 4   
	      @SuppressWarnings("unused")
		Queueee q = new Queueee(4);   
	   
	      System.out.println("Initial Queue:");  
	     // print Queue elements   
	      Queueee.queueDisplay();   
	   
	      // inserting elements in the queue   
	      Queueee.queueEnqueue(10);   
	      Queueee.queueEnqueue(30);   
	      Queueee.queueEnqueue(50);   
	      Queueee.queueEnqueue(70);   
	   
	      // print Queue elements   
	      System.out.println("Queue after Enqueue Operation:");  
	      Queueee.queueDisplay();   
	   
	      // print front of the queue   
	      Queueee.queueFront();   
	         
	      // insert element in the queue   
	      Queueee.queueEnqueue(90);   
	   
	      // print Queue elements   
	      Queueee.queueDisplay();   
	   
	      Queueee.queueDequeue();   
	      Queueee.queueDequeue();   
	      System.out.printf("\nQueue after two dequeue operations:");   
	   
	      // print Queue elements   
	      Queueee.queueDisplay();   
	   
	      // print front of the queue   
	      Queueee.queueFront();   
	  }   
}  