
package com.datacash.training.qpack;

// A child in Santa's list. Have they been naughty or nice this year?
public class Child {

	private ChildStatus status;
	private int id;

	// Assign a status based on child's naughtiness level
	public Child( int id, double naughtiness ) {
		if ( naughtiness > 0.5 ) {
			status = ChildStatus.NAUGHTY;
		}
		else {
			status = ChildStatus.NICE;
		}
		this.id = id;
	}

	// They get the present they deserve
	public String getPresent() {
		switch ( status ) {
			case NAUGHTY:
				return "Child number " + id + " gets a lump of coal!";
			case NICE:
				return "Child number " + id + " gets a wonderful toy!";
			default:
				return "Child number " + id + " gets...uh...a coal toy?";
		}

	}

}
