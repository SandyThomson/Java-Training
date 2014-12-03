/*
 * Try to use a stack
 */


public class StackDemo {
  
  public static void main ( String[] args ) {
    Stack stack = new Stack( 5 );
  
    System.out.println( "Made a stack");
    
    System.out.println( stack.pop( ) );
    
    stack.push( 'a' );
    stack.push( 'b' );
    stack.push( 'c' );
    stack.push( 'd' );
    stack.push( 'e' );
    
    stack.push( 'a' );
    
    System.out.println( "To String: " + stack.toString() );
    
    System.out.println( stack.pop( ) );
    System.out.println( "To String: " + stack.toString() );
    
    System.out.println( stack.pop( ) );
    System.out.println( "To String: " + stack.toString() );
    
    stack.push( 'f' );
    System.out.println( "To String: " + stack.toString() );
    
    System.out.println( stack.pop( ) );
    System.out.println( "To String: " + stack.toString() );
    
  }

}
