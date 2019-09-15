package model;
import java.util.ArrayList;

/**
 * @author Joshua Desmond
 *
 */
public class School {
	
	public ArrayList<Student>  studList = new ArrayList<Student>();
	public ArrayList<Teachers>  teachList = new ArrayList<Teachers>();
	
	/**
	 * Constructor for The School class, has 2 parameters
	 * @param a StudentList
	 * @param b TeacherList
	 */
	public School(ArrayList<Student> a, ArrayList<Teachers> b) {
		super();
		this.studList = a;
		this.teachList = b;
	}

	public ArrayList<Student> getStudList() {
		return studList;
	}

	public void setStudList(ArrayList<Student> studList) {
		this.studList = studList;
	}

	public ArrayList<Teachers> getTeachList() {
		return teachList;
	}

	public void setTeachList(ArrayList<Teachers> teachList) {
		this.teachList = teachList;
	}
	
	

}
