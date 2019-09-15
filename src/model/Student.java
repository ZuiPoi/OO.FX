package model;

import java.util.ArrayList;

/**
 * @author Joshua Desmond
 *
 */

public class Student extends Person {

	private ArrayList<ModuleGrade> modList =  new ArrayList<ModuleGrade>();
	String DOB;
	String Identfier;

	/**
	 * Constructor of the Student class-> inherits from Person Class
	 * Has 5 parameters
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 */
	public Student(Name a, String b, int c, String d,  ArrayList<ModuleGrade> e) {
		super(a, b, c);
		this.DOB = d;
		this.modList = e;

	}


	@Override
	public String toString() {
		return "Student [modList=" + modList + ", DOB=" + DOB + ", Identfier=" + Identfier + "]";
	}


	public String getIdentfier() {
		return Identfier;
	}


	public void setIdentfier(String identfier) {
		Identfier = identfier;
	}


	/**
	 * Getter-> returns the ModList
	 */
	public ArrayList<ModuleGrade> getModList() {
		return modList;
	}


	/**
	 * Setter -> Sets the modList
	 */
	public void setModList(ArrayList<ModuleGrade> modList) {
		this.modList = modList;
	}


	/**
	 * Getter-> returns DOB
	 */
	public String getDOB() {
		return DOB;
	}


	/**
	 * Setter-> returns  DOB
	 */
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	
	
}
