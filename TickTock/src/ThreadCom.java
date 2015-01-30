public class ThreadCom {

        public static void main( String[] args ) {
                TickTock tt = new TickTock();
                MyThread mt1 = new MyThread( TickTock.TICK, tt );
                MyThread mt2 = new MyThread( TickTock.TOCK, tt );

                try {
                        mt1.thrd.join();
                        mt2.thrd.join();
                }
                catch ( InterruptedException ie ) {
                        System.out.println( "Main thread interrupted" );
                }
        }

}
