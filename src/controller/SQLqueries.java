package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class SQLqueries {

	   private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	   private static final String URL = "jdbc:mysql://localhost:3306/oop";
	   private static final String USERNAME = "root";
	   private static final String PASSWORD = null;

	   private Connection connection = null; // manages connection
	   private PreparedStatement selectAllStudents = null; 
	   private PreparedStatement selectAllTeachers = null; 
	   private PreparedStatement insertNewStudent = null; 
	   private PreparedStatement insertNewTeacher = null; 
	   private PreparedStatement deleteAStudent = null;
	   private PreparedStatement deleteATeacher = null;

	   
	   /**
	 * Creates prepared statements and connection
	 */
	public SQLqueries() {
		   try 
		      {
		         connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
		         
		         // Query that selects all entries in the Student table
		         selectAllStudents =  connection.prepareStatement( "SELECT * FROM Student" );
		         selectAllTeachers =  connection.prepareStatement( "SELECT * FROM teacher" );
		         
		         // Insert that adds a new entry into the database
		         insertNewStudent = connection.prepareStatement( 
		            "INSERT INTO student " + 
		            "(firstname , midname , surnname, email, phoneNumber ,DOB, classGroup, module1, module1grade, module2, module2grade, module3, module3grade, module4, module4grade, module5, module5grade, module6, module6grade) " + 
		            "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? , ?, ?, ?, ?, ?, ? )" );
		         
		         insertNewTeacher = connection.prepareStatement( 
		        		 "INSERT INTO teacher " + 
		     		            "(firstname , midname , surnname, email, phoneNumber ,Degree) " + 
		     		            "VALUES ( ?, ?, ?, ?,?,?)" );
		         
		  	     deleteAStudent = connection.prepareStatement(
		  	    		 "DELETE FROM student WHERE email = " + "(?)");
		         
		  	   deleteATeacher = connection.prepareStatement(
		  	    		 "DELETE FROM teacher WHERE email = " + "(?)");
		      } // end try
		      catch ( SQLException sqlException )
		      {
		         sqlException.printStackTrace();
		         System.exit( 1 );
		      } // end catch
		   } // end SQLQueries constructor
	   
	   /**
	    * Tests whether a database connection can be made
	 * @return
	 * @throws Exception
	 */
	public static Connection testCon() throws Exception{
		   try {
			   Connection conn = null;
			   conn = DriverManager.getConnection( URL, USERNAME, PASSWORD );
			   System.out.println("POI");
			   return conn;
			   
		   } catch(Exception e) {System.out.println(e);}
		return null;
		   
	   }
	
	
	public List< Name > getAllTeacher()
	   {
	      List< Name > results = null;
	      ResultSet resultSet = null;
	      
	      try 
	      {
	         // executeQuery returns ResultSet containing matching entries
	         resultSet = selectAllTeachers.executeQuery(); 
	         results = new ArrayList< Name >();
	         
	         while ( resultSet.next() )
	         {
	        	 
	            results.add( new Name(
	            
	               resultSet.getString( "firstName" ),
	               resultSet.getString("midName"),
	               resultSet.getString("surnname" )
	            			)
	            	);

	         } // end while
	      } // end try
	      catch ( SQLException sqlException )
	      {
	         sqlException.printStackTrace();         
	      } // end catch
		return results;

	      }  // end finally
	
	
	public List< Name > getAllStudent()
	   {
	      List< Name > results = null;
	      ResultSet resultSet = null;
	      
	      try 
	      {
	         // executeQuery returns ResultSet containing matching entries
	         resultSet = selectAllStudents.executeQuery(); 
	         results = new ArrayList< Name >();
	         
	         while ( resultSet.next() )
	         {
	        	 
	            results.add( new Name(
	            
	               resultSet.getString( "firstName" ),
	               resultSet.getString("midName"),
	               resultSet.getString("surnname" )
	            			)
	            	);

	         } // end while
	      } // end try
	      catch ( SQLException sqlException )
	      {
	         sqlException.printStackTrace();         
	      } // end catch
		return results;

	      }  // end finally
	
	
	
/*	public List< Student > getAllStudent()
	   {
	      List< Student > results = null;
	      ResultSet resultSet = null;
	      
	      try 
	      {
	         // executeQuery returns ResultSet containing matching entries
	         resultSet = selectAllStudents.executeQuery(); 
	         results = new ArrayList< Student >();
	         
	         while ( resultSet.next() )
	         {
	            	Name n1 = new Name(resultSet.getString( "firstName" ),  resultSet.getString("midName"), resultSet.getString("surnname" ));
	            	ArrayList<ModuleGrade> modList =  new ArrayList<ModuleGrade>();
	            	 ModuleGrade m1 = new ModuleGrade(resultSet.getString( "module1" ),  resultSet.getString("module1grade"));
	            	 ModuleGrade m2 = new ModuleGrade(resultSet.getString( "module2" ),  resultSet.getString("module2grade"));
	            	 ModuleGrade m3 = new ModuleGrade(resultSet.getString( "module3" ),  resultSet.getString("module3grade"));
	            	 ModuleGrade m4 = new ModuleGrade(resultSet.getString( "module4" ),  resultSet.getString("module4grade"));
	            	 ModuleGrade m5 = new ModuleGrade(resultSet.getString( "module5" ),  resultSet.getString("module5grade"));
	            	 ModuleGrade m6 = new ModuleGrade(resultSet.getString( "module6" ),  resultSet.getString("module6grade"));
	            	 modList.add(m1);
	            	 modList.add(m2);
	            	 modList.add(m3);
	            	 modList.add(m4);
	            	 modList.add(m5);
	            	 modList.add(m6);
	            results.add( new Student(
	            		n1,
	            		resultSet.getString( "email" ),
	            		resultSet.getInt( "phoneNumber" ),
	            		resultSet.getString( "DOB" ),
	            		modList

	            			)
	            	);

	         } // end while
	      } // end try
	      catch ( SQLException sqlException )
	      {
	         sqlException.printStackTrace();         
	      } // end catch
		return results;

	      } // end finally */
	   /**
	    * Inserts A student to the database oop in the student table
	 * @param fname
	 * @param midname
	 * @param lname
	 * @param email
	 * @param num
	 * @param DOB
	 * @param classGroup
	 * @param module1
	 * @param module1grade
	 * @param module2
	 * @param module2grade
	 * @param module3
	 * @param module3grade
	 * @param module4
	 * @param module4grade
	 * @param module5
	 * @param module5grade
	 * @param module6
	 * @param module6grade
	 * @return
	 * @throws SQLException
	 */
	public int addStudent( 
			      String fname,String midname, String lname, String email, String num,String DOB,String classGroup, String module1, String module1grade, String module2, String module2grade, String module3, String module3grade, String module4, String module4grade, String module5, String module5grade, String module6, String module6grade  ) throws SQLException
			   {

		    connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
		         
			      int result = 0;
			      
			      // set parameters, then execute insertNewPerson
			      try 
			      {
			         insertNewStudent.setString( 1, fname );
			         insertNewStudent.setString( 2, midname );
			         insertNewStudent.setString( 3, lname );
			         insertNewStudent.setString( 4, email );
			         insertNewStudent.setString( 5, num );
			         insertNewStudent.setString( 6, num );
			         insertNewStudent.setString( 7, classGroup );
			         insertNewStudent.setString( 8, module1 );
			         insertNewStudent.setString( 9, module1grade );
			         insertNewStudent.setString( 10, module2 );
			         insertNewStudent.setString( 11, module2grade );
			         insertNewStudent.setString( 12, module3 );
			         insertNewStudent.setString( 13, module3grade );
			         insertNewStudent.setString( 14, module4 );
			         insertNewStudent.setString( 15, module4grade );
			         insertNewStudent.setString( 16, module5 );
			         insertNewStudent.setString( 17, module5grade );
			         insertNewStudent.setString( 18, module6 );
			         insertNewStudent.setString( 19, module6grade );


			         // insert the new entry; prints num of rows updated
			         result = insertNewStudent.executeUpdate(); 
			         System.out.println("Entries added:" +result);
			      } // end try
			      catch ( SQLException sqlException )
			      {
			         sqlException.printStackTrace();
			         //close();
			      } // end catch
			      
			      return result;
			   } // end method addPerson
	   
		/**
		 * Inserts A Teacher to the database oop in the Teacher table
		 * @param fname
		 * @param midname
		 * @param lname
		 * @param email
		 * @param num
		 * @param Degree
		 * @return
		 * @throws SQLException
		 */
		public int addTeacher(String fname, String midname, String lname, String email, String num, String Degree) throws SQLException {
		      int result = 0;
			    connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
			try 
		      {
				insertNewTeacher.setString( 1, fname );
				insertNewTeacher.setString( 2, midname );
				insertNewTeacher.setString( 3, lname );
				insertNewTeacher.setString( 4, email );
				insertNewTeacher.setString( 5, num );
				insertNewTeacher.setString( 6, Degree );
		         // insert the new entry; prints num of rows updated
		         result = insertNewTeacher.executeUpdate(); 
		         System.out.println("Entries added:" +result);
		      }
			 catch ( SQLException sqlException )
		      {
		         sqlException.printStackTrace();
		         System.exit( 1 );
		      }
			return result;
		}
		
		
		public int deleteStudent( String Email) throws SQLException {

		    connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
		         
			      int result = 0;
			      
			      // set parameters, then execute insertNewPerson
			      try 
			      {
				         deleteAStudent.setString( 1, Email );
				         
				       
				         result = deleteAStudent.executeUpdate(); 
				         System.out.println("Entries Deleted:" +result);
				
			      }
					 catch ( SQLException sqlException )
				      {
				         sqlException.printStackTrace();
				         System.exit( 1 );
				      }
					return result;
				}
		
		public int deleteTeacher( String Email) throws SQLException {

		    connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
		         
			      int result = 0;
			      
			      // set parameters, then execute insertNewPerson
			      try 
			      {
				         deleteATeacher.setString( 1, Email );
				         
				       
				         result = deleteATeacher.executeUpdate(); 
				         System.out.println("Entries Deleted:" +result);
				
			      }
					 catch ( SQLException sqlException )
				      {
				         sqlException.printStackTrace();
				         System.exit( 1 );
				      }
					return result;
				}
	   /**
	 * close
	 */
	public void close()
	   {
	      try 
	      {
	         connection.close();
	      } // end try
	      catch ( SQLException sqlException )
	      {
	         sqlException.printStackTrace();
	      } // end catch
	   } // end method close


		   
}
	   


