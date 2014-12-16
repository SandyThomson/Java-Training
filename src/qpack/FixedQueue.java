package qpack;

public class FixedQueue implements IcharQ {

	private char q[];
	private int putloc, getloc;

	public FixedQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	@Override
	public void put(char ch) {
		if (putloc == q.length) {
			System.out.println("Queue is full");
			return;
		}

		q[putloc++] = ch;
	}

	@Override
	public char get() {
		if (getloc == putloc) {
			System.out.println("Queue is empty");
			return (char) 0;
		}

		return q[getloc++];
	}

}
