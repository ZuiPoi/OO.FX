package controller;

import java.util.ArrayList;

import model.ClassGroup;
import model.ModuleGrade;
import model.Student;

public class CGroupController {
	
	static ArrayList<Student> cGroup =  new ArrayList<Student>();
	
	 static void newCGroup(String g1) {
		 ClassGroup cg = new ClassGroup(g1, cGroup);
	 }
	 
	 static void addCGroup(String g1) {
		 
	 }
}
