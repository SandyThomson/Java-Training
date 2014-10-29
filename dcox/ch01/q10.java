
package ch01;
/*  
   Self Test Ch1 Q10 - based on Try This 1-2 
    
   This program displays a conversion  
   table of inches to metres. 
*/  
class InchesToMetresTable {  
  public static void main(String args[]) {  
    double metres; 
    int inches, counter; 
                        
    counter = 0; 
    for(inches = 1; inches <= 144; inches++) { 
      metres = inches * 0.0254; // convert to metres
      System.out.println(inches + " inches is " + 
                         metres + " metres."); 
                                                                       
      counter++; 
      // every 12th line, print a blank line        
      if(counter == 12) { 
        System.out.println(); 
        counter = 0; // reset the line counter 
      } 
    } 
  }  
}

