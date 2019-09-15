package controller;

import java.sql.SQLException;
import java.util.List;

import model.Name;

/**
 * @author Joshua Desmond
 *
 */
public class TeachController {
	public static SQLqueries SQL = new SQLqueries();
/**
 * Function to bridge GUI and SQL system, used to insert a Teacher to the database
 * @param a1
 * @param a2
 * @param a3
 * @param a4
 * @param a5
 * @param a6
 * @throws SQLException
 */
public static void getTeach( String a1, String a2, String a3, String a4, String a5, String a6) throws SQLException {
	SQL.addTeacher(a1,a2,a3,a4,a5,a6);
}

/**
 * Deletes a teacher from the DB
 * @param g1
 * @throws SQLException
 */
public static void delTeach(String g1) throws SQLException {
	SQL.deleteTeacher(g1);
}

/**
 * Prints all teachers names from DB
 * @throws SQLException
 */
public static void showTeach() throws SQLException {
	List< Name > results = SQL.getAllTeacher();

		System.out.println(results.toString());
	
}
}
