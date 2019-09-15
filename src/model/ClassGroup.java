package model;

import java.util.ArrayList;

/**
 * @author Joshua desmond
 *
 */
public class ClassGroup { 

	private String gName;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	
	/**
	 * Constructor of ClassGroup Class-> has 2 parameters
	 * @param a
	 * @param b
	 */
	public ClassGroup(String a, ArrayList<Student> b) {

		this.gName = a;
		this.studentList = b;
	}


	/**
	 * Getter-> returns GroupName
	 */
	public String getgName() {
		return gName;
	}


	/**
	 * Setter-> sets  gName
	 */
	public void setgName(String gName) {
		this.gName = gName;
	}


	/**
	 * Getter-> returns An arrayList of students
	 */
	public ArrayList<Student> getStudentList() {
		return studentList;
	}


	/**
	 * Setter-> sets arrayList of student studentList
	 */
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	
	
}
