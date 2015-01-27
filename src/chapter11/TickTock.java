package chapter11;


public class TickTock {
  String state; // contains the state of the clock
   
  synchronized void tick(boolean running) { 
    if(!running) { // stop the clock 
      state = "ticked";
      notify(); // notify any waiting threads 
      return; 
    } 
 
    System.out.print("Tick "); 
    try {
      Thread.sleep( 500 );
    }
    catch ( InterruptedException e ) {
      e.printStackTrace();
    }

    state = "ticked"; // set the current state to ticked

    notify(); // let tock() run 
    try { 
      while(!state.equals("tocked"))
        wait(); // wait for tock() to complete 
    } 
    catch(InterruptedException exc) { 
      System.out.println("Thread interrupted."); 
    } 
  } 
 
  synchronized void tock(boolean running) { 
    if(!running) { // stop the clock 
      state = "tocked";
      notify(); // notify any waiting threads 
      return; 
    } 
 
    System.out.println("Tock"); 
    try {
      Thread.sleep( 500 );
    }
    catch ( InterruptedException e ) {
      e.printStackTrace();
    }

    state = "tocked"; // set the current state to tocked

    notify(); // let tick() run 
    try { 
      while(!state.equals("ticked"))
        wait(); // wait for tick to complete 
    } 
    catch(InterruptedException exc) { 
      System.out.println("Thread interrupted."); 
    } 
  } 


}
