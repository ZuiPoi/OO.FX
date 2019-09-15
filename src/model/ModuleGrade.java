package model;

/**
 * @author Joshua Desmond
 *
 */
public class ModuleGrade {

	String modName;
	String grade;
	
	/**
	 * Constructor for "moduleGrade" class
	 * Takes 2 Strings as parameters,
	 */
	public ModuleGrade(String a, String b) {
		this.modName = a;
		this.grade = b;
	}

	/**
	 * Getter - Returns modName string of ModuleGrade
	 */
	public String getModName() {
		return modName;
	}

	/**
	 * Setter - Sets modName string of ModuleGrade
	 */
	public void setModName(String modName) {
		this.modName = modName;
	}

	/**
	 *  Getter - Returns grade string of ModuleGrade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 *  Setter - Sets grade string of ModuleGrade
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}
