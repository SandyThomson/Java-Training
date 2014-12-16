package qpack;


public interface ICharQ {
  // Put a character into the queue.    
  void put(char ch); 
 
  // Get a character from the queue.   
  char get(); 
  
  // exciting new default method
  default void reset() {
    System.out.println( "This must be implemented by your class" );
  }
}
