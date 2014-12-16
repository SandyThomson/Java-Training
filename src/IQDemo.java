import qpack.CircularQueue;
import qpack.FixedQueue;

public class IQDemo {

	public void testQueueStuff() {

		CircularQueue cq = new CircularQueue(10);
		FixedQueue fq = new FixedQueue(5);

		qpack.DynQueue dq = new qpack.DynQueue(22); // An example with no
													// import, for fits and
													// giggles.

		cq.put('a');
		fq.put('b');
		dq.put('c');

		// etc

	}

}
