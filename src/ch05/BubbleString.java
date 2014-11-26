package ch05;

/*
 * Try This 5-1 Demonstrate the Bubble sort. Expanded to do strings
 */

class BubbleString {

	public static void main( String args[] ) {
		String strs[] = { "ab", "cd", "ef", "gh", "ij",
		    "bc", "de", "fg", "hi", "jk" };
		int a, b;
		String t;
		int size;

		size = 10; // number of elements to sort  

		// display original array  
		System.out.print( "Original array is:" );
		for ( int i = 0 ; i < size ; i++ )
			System.out.print( " " + strs[i] );
		System.out.println();

		// This is the bubble sort.  
		for ( a = 1 ; a < size ; a++ )
			for ( b = size - 1 ; b >= a ; b-- ) {
				if ( strs[b - 1].compareTo( strs[b] ) > 0 ) { // if out of order  
					// exchange elements   
					t = strs[b - 1];
					strs[b - 1] = strs[b];
					strs[b] = t;
				}
			}

		// display sorted array  
		System.out.print( "Sorted array is:" );
		for ( int i = 0 ; i < size ; i++ )
			System.out.print( " " + strs[i] );
		System.out.println();
	}
}

