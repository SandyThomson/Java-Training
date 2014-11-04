package ch02;

/*  
   Self Test Ch2 Q10
    
   Prints out primes between 2 and 100. 

   Attempt without arrays or collection or whatnot
*/  
class primes_simple {  
  public static void main(String args[]) {  
    int num, div;
    boolean isPrime;

    // horribly inefficient, testing even numbers too
    for(num = 2; num <= 100; num++) {
      // assume prime until proven otherwise
      isPrime = true;

      // test from 2 up to num, can't be a multiple of a bigger number
      // horribly inefficient, testing against numbers that aren't prime
      for(div = 2; div < num; div++) {
        if(num % div == 0 ) {
          // proven otherwise!
          isPrime = false;
        }
      }

      // Report ..
      if(isPrime == true) {
        System.out.print(num + " ");
      }
    }

    // .. and a newline to be tidy
    System.out.println();
  }  
}

