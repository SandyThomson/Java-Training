/**
 * 
 */
package main.java.parser;

/**
 * @author Michael.Wambeek
 *
 */
public class Line {

	private String line;
	private String customerID, surname, forename, cardNumber, expiry, cv2,
			address, postcode, telephone;
	private static boolean removeCv2 = false;

	public static final String SEP = "|";
	public static final String REGEX_SEP = "\\" + SEP;

	public Line(String line) {
		this.line = line;
		String[] columns = line.split(REGEX_SEP);

		customerID = columns[0];
		surname = columns[1];
		forename = columns[2];
		cardNumber = columns[3];
		expiry = columns[4];
		cv2 = columns[5];
		address = columns[6];
		postcode = columns[7];
		telephone = columns[8];
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the forename
	 */
	public String getForename() {
		return forename;
	}

	/**
	 * @param forename the forename to set
	 */
	public void setForename(String forename) {
		this.forename = forename;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the expiry
	 */
	public String getExpiry() {
		return expiry;
	}

	/**
	 * @param expiry the expiry to set
	 */
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	/**
	 * @return the cv2
	 */
	public String getCv2() {
		return cv2;
	}

	/**
	 * @param cv2 the cv2 to set
	 */
	public void setCv2(String cv2) {
		this.cv2 = cv2;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/**
	 * 
	 */
	public static void removeCv2(){
		removeCv2 = true;
	}
	
	/**
	 * 
	 */
	public static void retainCv2(){
		removeCv2 = false;
	}

	@Override
	public String toString() {
		return customerID + SEP + surname + SEP + forename + SEP + cardNumber
				+ SEP + expiry + SEP + (removeCv2 ? "" : cv2 + SEP) + address + SEP + postcode
				+ SEP + telephone;
	}

}
