package chapter11;

import chapter11.EmptyStackException;
import chapter11.FullStackException;


public class Stack {
  
  private char[] stack;
  
  Stack ( int size ) {
    this.stack = new char[size];
  }
  
  Stack ( ) {
    // default to 10 I guess?
    this( 10 );
  }
  
  private int firstIndex () {
    // Instead of a counter variable, this method figures out the first
    // empty index (i.e. 0)
    // I guess someone could insert 0 as a character, but sucks to be them
    
    for ( int i = 0; i < this.stack.length ; i++ ) {
      if ( stack[i] == 0 ) {
        return i;
      }
    }
    
    // Return array length if it's full
    return this.stack.length;
    
  }

  public synchronized void push ( char character ) throws FullStackException {
    
    int position = firstIndex();
    
    if ( position == this.stack.length ) {
      // Now I can throw exceptions all over the place!
      throw new FullStackException();
    }
    System.out.println( "Pushed " + character );
    this.stack[ position ] = character;
    
  }
  
  public synchronized char pop ( ) throws EmptyStackException {
    
    int position = firstIndex();
    
    if ( position == 0 ) {
      throw new EmptyStackException();
    } 
    
    char character = this.stack[position - 1];
    // Remove character
    this.stack[position - 1] = 0;
    
    return character;
  }
  
  public String toString () {
    // Useful for dumping
    String s = new String( );
    for ( char c : this.stack ) s += c;
    return s;
  }
  
}
