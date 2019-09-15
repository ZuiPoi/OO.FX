package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ModuleGrade;
import model.Name;
import model.Student;


/**
 * @author Joshua Desmond
 *
 */

public class StudController {
	public static ArrayList<Student> studentlist =  new ArrayList<Student>();
	static ArrayList<ModuleGrade> modList =  new ArrayList<ModuleGrade>();
	public static SQLqueries SQL = new SQLqueries();
	
	// Method that would create grades if this were implemented as a seperate table
	/* public static void getmods(String g1, String g2, String g3, String g4, String g5,String g6,String g7, String g8, String g9, String g10, String g11,String g12 ) {
	ModuleGrade m1 = new ModuleGrade(g1,g7);
	ModuleGrade m2 = new ModuleGrade(g2,g8);
	ModuleGrade m3 = new ModuleGrade(g3,g9);
	ModuleGrade m4 = new ModuleGrade(g4,g10);
	ModuleGrade m5 = new ModuleGrade(g5,g11);
	ModuleGrade m6 = new ModuleGrade(g6,g12);
	}	*/
	/**
	 * Function to bridge GUI and SQL system, used to insert a student to the database
	 * @param g1
	 * @param g2
	 * @param g3
	 * @param g4
	 * @param g5
	 * @param g6
	 * @param g22
	 * @param g7
	 * @param g8
	 * @param g9
	 * @param g10
	 * @param g11
	 * @param g12
	 * @param g13
	 * @param g14
	 * @param g15
	 * @param g16
	 * @param g17
	 * @param g18
	 * @throws SQLException
	 */
	public static void getStud(String g1, String g2, String g3, String g4, String g5,String g6,String g22, String g7, String g8, String g9, String g10, String g11,String g12, String g13, String g14, String g15, String g16, String g17, String g18) throws SQLException {

     SQL.addStudent(g1,g2, g3, g4, g5, g6 ,g22, g7 , g8, g9, g10, g11, g12, g13, g14, g15 , g16, g17, g18);
	
	}
	
	/**
	 * Used to delete a Student from the table, uses email as match variable
	 * @param g1
	 * @throws SQLException
	 */
	public static void delStud(String g1) throws SQLException {
		SQL.deleteStudent(g1);
	}
	
	public static void showStud() throws SQLException {
		List< Name > results = SQL.getAllStudent();
	
			System.out.println(results.toString());
		
	}
}
;