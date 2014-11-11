package org.java.training;

import java.io.IOException;

/**
 * Chapter 3 self test #10.
 */
public class CaseSwitcher {

	public static void main(String[] args) throws IOException {
		int caseChanges = 0;
		for ( int ch, out; ( ch = System.in.read() ) != '.' ; ) {
			out = ch <= 'Z' && ch >= 'A' ? ch + 32 : ch;
			out = ch <= 'z' && ch >= 'a' ? ch - 32 : out;

			caseChanges = out == ch ? caseChanges : ++caseChanges;
			System.out.print( (char)out );
		}

		System.out.printf("%nThis required %d case changes%n", caseChanges);
	}

}
