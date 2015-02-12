package Chapter13;
// Generic stack


public class Stack<T> implements Stackable<T> {

  private T[] stack;
  // Gone back to the position counter
  int position;
  
  Stack ( T[] stack ) {
    this.stack = stack;
    position = 0;
  }

  public void push ( T object ) throws FullStackException {
    
    if ( position == this.stack.length ) {
      throw new FullStackException();
    }
    System.out.println( "Pushed " + object );
    this.stack[ position ] = object;
    position++;
    
  }
  
  public T pop ( ) throws EmptyStackException {
    
    if ( position == 0 ) {
      throw new EmptyStackException();
    } 
    
    T character = this.stack[position];
    position--;
    
    return character;
  }
  
  public String toString () {
    // Useful for dumping
    String s = new String( );
    for ( T object : this.stack ) s += object.toString();
    return s;
  }
  
}
