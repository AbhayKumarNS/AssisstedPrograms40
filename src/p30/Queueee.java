package p30;

public class Queueee { 
    
  private static int front, rear, capacity;   
  private static int queue[];   
   
  Queueee(int size) {   
      front = rear = 0;   
      capacity = size;   
      queue = new int[capacity];   
  }   

  public static void queueEnqueue(int item)  {   
      if (capacity == rear) {   
          System.out.printf("\nQueue is full\n");   
          return;   
      }   
      else {   
          queue[rear] = item;   
          rear++;   
      }   
      return;   
  }   

  public static void queueDequeue()  
  {   
      if (front == rear) {   
          System.out.printf("\nQueue is empty\n");   
          return;   
      }   
      else {   
          for (int i = 0; i < rear - 1; i++) {   
              queue[i] = queue[i + 1];   
          }   
    if (rear < capacity)   
              queue[rear] = 0;   
        rear--;   
      }   
      return;   
  }   
   
  public static void queueDisplay()   
  {   
      int i;   
      if (front == rear) {   
          System.out.printf("Queue is Empty\n");   
          return;   
      }   
   
      for (i = front; i < rear; i++) {   
          System.out.printf(" %d , ", queue[i]);   
      }   
      return;   
  }   
   
 public static void queueFront()   
  {   
      if (front == rear) {   
          System.out.printf("Queue is Empty\n");   
          return;   
      }   
      System.out.printf("\nFront Element of the queue: %d", queue[front]);   
      return;   
  }
}

 
