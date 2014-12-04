package selftest;

class Backwards {
	String str;
	
	Backwards( String s ) {
		str = s;
	}
	
	void backward(int i) {
		if( i != str.length() - 1 ) {
			backward(i+1);
		}
		System.out.print(str.charAt(i));
	}
}

class BackwardsDemo {
	public static void main( String[] args ) {
		Backwards s = new Backwards("OMG, it's gone all back to front!");
		s.backward(0);
	}
}

