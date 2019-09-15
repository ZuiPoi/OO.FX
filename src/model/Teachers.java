package model;

/**
 * @author Joshua Desmond
 *
 */
public class Teachers extends Person {

	private String Degree;
	
	/**
	 * Constructor of Teacher class-> inherits from Person Class
	 * 4 Parameters;
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public Teachers(Name a, String b, int c, String d) {
		super(a, b, c);
		this.Degree = d;
	}
//	

	/**
	 * Getter-> Returns degree
	 */
	public String getDegree() {
		return Degree;
	}

	/**
	 * Setter-> Sets degree
	 */
	public void setDegree(String degree) {
		Degree = degree;
	}



}
