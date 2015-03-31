package main.java;

import main.java.annotations.Delete;
import main.java.annotations.Obfuscate;

public class CustomerData {

	private int id;
	private String surname;
	private String forename;
	
	@Obfuscate( showFirst = 6, showLast = 4)
	private String pan;
	private String expiry;
	
	@Delete
	private String cv2;
	private String address;
	private String postcode;
	private String telephone;
	
}
