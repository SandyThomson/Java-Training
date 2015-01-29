// Use wait() and notify() to create a ticking clock.
class TickTock {
String state; // contains the state of the clock
synchronized void tick(boolean running) {
if(!running) { // stop the clock
state = "ticked";
notify(); // notify any waiting threads
return;
}
System.out.print("Tick ");
state = "ticked"; // set the current state to ticked
notify(); // let tock() run
tick( ) notifies tock( ).
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
tick( ) waits for tock( ).
397  398  
Java: A Beginner’s Guide
state = "tocked";
notify(); // notify any waiting threads
return;
}
System.out.println("Tock");
state = "tocked"; // set the current state to tocked
notify(); // let tick() run
tock( ) notifies tick( ).
try {
while(!state.equals("ticked"))
wait(); // wait for tick to complete
tock( ) waits for tick( ).
}
catch(InterruptedException exc) {
System.out.println("Thread interrupted.");
}
}
}
class MyThread implements Runnable {
Thread thrd;
TickTock ttOb;
// Construct a new thread.
MyThread(String name, TickTock tt) {
thrd = new Thread(this, name);
ttOb = tt;
thrd.start(); // start the thread
}
// Begin execution of new thread.
public void run() {
if(thrd.getName().compareTo("Tick") == 0) {
for(int i=0; i<5; i++) ttOb.tick(true);
ttOb.tick(false);
}
else {
for(int i=0; i<5; i++) ttOb.tock(true);
ttOb.tock(false);
}
}
}
class ThreadCom {
public static void main(String args[]) {
TickTock tt = new TickTock();
MyThread mt1 = new MyThread("Tick", tt);
MyThread mt2 = new MyThread("Tock", tt);  
Chapter 11:  Multithreaded Programming  
try {
mt1.thrd.join();
mt2.thrd.join();
} catch(InterruptedException exc) {
System.out.println("Main thread interrupted.");
}
}
}
