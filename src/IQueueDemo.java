

public class IQueueDemo {
  public static void main(String args[]) {    
    
    // The extent of question 1
    qpack.FixedQueue q1 = new qpack.FixedQueue(10);    
    qpack.DynQueue q2 = new qpack.DynQueue(5); 
    qpack.CircularQueue q3 = new qpack.CircularQueue(10); 
 
    qpack.ICharQ iQ; 
    
    // Everything is the same after this part
 
    char ch;    
    int i;    
 
    iQ = q1;    
    // Put some characters into fixed queue.    
    for(i=0; i < 10; i++)    
      iQ.put((char) ('A' + i));    
   
    // Show the queue. 
    System.out.print("Contents of fixed queue: ");    
    for(i=0; i < 10; i++) {     
      ch = iQ.get();    
      System.out.print(ch);    
    } 
    System.out.println(); 
 
    iQ = q2; 
    // Put some characters into dynamic queue.    
    for(i=0; i < 10; i++)    
      iQ.put((char) ('Z' - i));    
   
    // Show the queue. 
    System.out.print("Contents of dynamic queue: ");    
    for(i=0; i < 10; i++) {     
      ch = iQ.get();    
      System.out.print(ch);    
    }    
 
    System.out.println(); 
 
    iQ = q3; 
    // Put some characters into circular queue.    
    for(i=0; i < 10; i++)    
      iQ.put((char) ('A' + i));    
   
    // Show the queue. 
    System.out.print("Contents of circular queue: ");    
    for(i=0; i < 10; i++) {     
      ch = iQ.get();    
      System.out.print(ch);    
    }    
 
    System.out.println(); 
 
    // Put more characters into circular queue.    
    for(i=10; i < 20; i++)    
      iQ.put((char) ('A' + i));    
 
    // Show the queue. 
    System.out.print("Contents of circular queue: ");    
    for(i=0; i < 10; i++) {     
      ch = iQ.get();    
      System.out.print(ch);    
    }    
 
    System.out.println("\nStore and consume from" + 
                       " circular queue."); 
 
    // Use and consume from circular queue. 
    for(i=0; i < 20; i++) { 
      iQ.put((char) ('A' + i));    
      ch = iQ.get();    
      System.out.print(ch);    
    }    
 
  }
}
