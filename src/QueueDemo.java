
public class QueueDemo {
  public static void main(String args[]){
	  char ch;
	  int i;
	 
	  Queue myQueue = new Queue(100);
	  QueueThread threadedQ = new QueueThread(myQueue);
	  
	  Thread thr1 = new Thread(threadedQ);
	  Thread thr2 = new Thread(threadedQ);
	  
	  thr1.start();
	  thr2.start();
	  
	  try{
	    thr1.join();
	    thr2.join();
	  }
	  catch (InterruptedException exc){
		System.out.println("Thread interrupted");
	  }
	  
	  System.out.print("Contents of Threaded Queue: ");
	  for (i=0; i < 53; i++){
		  ch = myQueue.get();
		  if (ch != (char) 0) System.out.print(ch);
	  }
   }
}

class QueueThread implements Runnable{
	
	Queue myQueue;
	
	QueueThread (Queue aQueue) {
		myQueue = aQueue;
	}
	
	public void run(){
		int i;
		for (i=0; i < 26; i++) {
			System.out.println("About to add " +  (char) ('A' + i));
			myQueue.put( (char) ('A' + i));
		}
	}
}

class Queue {
	char q[];
	int putloc, getloc;
	
	Queue (int size) {
		q = new char[size];
		putloc = getloc = 0;
	}
	
    synchronized void put (char ch){
    	if(putloc==q.length){
    		System.out.println(" - Queue is full.");
    		return;
    	}
    	q[putloc++] = ch;
    }
    
    synchronized char get(){
    	if (getloc == putloc){
    		System.out.println(" - Queue is empty.");
    		return (char) 0;
    	}
    	return q[getloc++];
    }
}

