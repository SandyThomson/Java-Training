package main.java.sixteen;

//This class stores an int value and defines the instance 
//method isFactor(), which returns true if its argument 
//is a factor of the stored value. 
class MyIntNum {
	private int v;

	MyIntNum(int x) {
		v = x;
	}

	int getNum() {
		return v;
	}

	// Return true if n is a factor of v.
	boolean isFactor(int n) {
		return (v % n) == 0;
	}

	/**
	 * @param number
	 * @return
	 */
	public boolean hasCommonFactor(int number) {
		int x, y;

		if (v < number) {
			x = v;
			y = number;
		} else {
			x = number;
			y = v;
		}

		for (int i = 2; i < x; i++) {
			if ((x % i == 0) && (y % i == 0)) {
				return true;
			}
		}

		return false;
	}
}
