package model;

/**
 * @author Joshua Desmond
 *
 */
public class Person {
	private Name name;
	private String emailAddress;
	private int phoneNo;
	

	/**
	 * Constructor of the Person Superclass, takes 3 parameters
	 * @param a
	 * @param b
	 * @param c
	 */
	public Person(Name a, String b, int c) {
		this.name = a;
		this.emailAddress = b;
		this.phoneNo= c;
	}


	/**
	 * Getter-> Returns Person Name
	 */
	public Name getName() {
		return name;
	}


	/**
	 * Setter-> Sets Name of person using name class
	 */

	public void setName(Name name) {
		this.name = name;
	}



	/**
	 * Getter-> Returns Email Address String of Person 
	 */
	public String getEmailAddress() {
		return emailAddress;
	}


	/**
	 * Setter-> Sets Email Address String of Person
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	/**
	 * Getter -> Returns Phone Number int of Person
	 */
	public int getPhoneNo() {
		return phoneNo;
	}


	/**
	 * Setter -> Sets phone Number int of Person
	 */
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String toString() {
		return "Person [name=" + name + ", emailAddress=" + emailAddress + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
