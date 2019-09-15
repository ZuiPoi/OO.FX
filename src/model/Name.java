package model;

/**
 * @author Joshua Desmond
 *
 */
public class Name {
	String firstName;
	String secondName;
	String middleName;
	
	
	/**
	 * Constructor of Name class that takes 3 parameters
	 * @param a
	 * @param b
	 * @param c
	 */
	public Name(String a, String b , String c) {
		this.firstName = a;
		this.secondName = b;
		this.middleName = c;		
	}
	
	/**
	 *Constructor of Name class that takes 2 parameters
	 * @param a
	 * @param b
	 */
	public Name(String a, String b) {
		this.firstName = a;
		this.secondName = b;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", secondName=" + secondName + ", middleName=" + middleName + "]";
	}

	/**
	 * Getter - returns firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter-> Sets firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter-> returns secondName
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * Setter-> Sets secondName
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * Getter-> returns middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Setter-> Sets middleName
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	
	

}
