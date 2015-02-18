package Chapter14;


public class MyIntNum {
  private int v; 
  
  MyIntNum(int x) { v = x; } 
 
  int getNum() { return v; } 
 
  // Return true if n is a factor of v. 
  boolean isFactor(int n) { 
    return (v % n) == 0; 
  } 
  
  boolean hasCommonFactor( int n ) {
  	
  	int limit = ( v <= n ? v : n ) / 2;
  	
  	if ( limit >= 2 ) {
  	
      for ( int i = 2; i < limit; i++ ) {
        if (isFactor(i) && (n % i == 0) ) {
        	return true;
        }
      }
  	}
  	
  	return false;
  	
  }
}
