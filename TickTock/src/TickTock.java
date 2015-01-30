public class TickTock {

        public static final String TICK = "Tick";
        public static final String TOCK = "Tock";
        public static final String STATE_TICKED = "ticked";
        public static final String STATE_TOCKED = "tocked";

        public static final Long TIME_SECOND = 1000l;

        String state;

        synchronized void tick( boolean running ) {
                if ( !running ) {
                        state = STATE_TICKED;
                        notify();
                        return;
                }

                System.out.print( TICK + " " );

                state = STATE_TICKED;

                try {
                        Thread.sleep( TIME_SECOND / 2 );
                }
                catch ( InterruptedException e ) {
                        e.printStackTrace();
                }

                notify();

                try {
                        while ( !state.equals( STATE_TOCKED ) ) {
                                wait();
                        }
                }
                catch ( InterruptedException ie ) {
                        System.out.println( "Thread interrupted" );
                }
        }

        synchronized void tock( boolean running ) {
                if ( !running ) {
                        state = STATE_TOCKED;
                        notify();
                        return;
                }

                System.out.println( TOCK + " " );

                state = STATE_TOCKED;

                try {
                        Thread.sleep( TIME_SECOND / 2 );
                }
                catch ( InterruptedException e ) {
                        e.printStackTrace();
                }

                notify();

                try {
                        while ( !state.equals( STATE_TICKED ) ) {
                                wait();
                        }
                }
                catch ( InterruptedException ie ) {
                        System.out.println( "Thread interrupted" );
                }
        }

}
