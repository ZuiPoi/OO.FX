package oop50;

import java.io.BufferedReader;
import java.util.Hashtable;

import com.sun.javafx.collections.MappingChange.Map;

import java.io.FileReader;
import java.io.IOException;

public class HashInput {
	public static Hashtable<Integer, String[]> hashTable1 = new Hashtable();
	public static Hashtable<Integer, String[]> hashTable2 = new Hashtable();
	public static Hashtable<Integer, String[]> hashTable3 = new Hashtable();
	public static void main(String[] args) throws IOException {
		

		BufferedReader bufferedReader = new BufferedReader(new FileReader("Prizes.txt"));
	    String line = "";

	    int i = 1;
	    while ((line = bufferedReader.readLine()) != null) {
	    	
	    	// will split up each level of prize to its own map;
	    	if (line.contains("2")) {
		    	String [] arSTR = line.split("-"); 
			    hashTable1.put(i, arSTR );
	    	}
	    	
	    	if (line.contains("4")) {
		    	String [] arSTR = line.split("-"); 
			    hashTable2.put(i, arSTR );
	    	}
	    	
	    	if (line.contains("5")) {
		    	String [] arSTR = line.split("-"); 
			    hashTable3.put(i, arSTR );

	    	}
	    	else {
	    		
	    	}
	    	/*String [] arSTR = line.split("-"); 
		    hashTable1.put(i, arSTR );
	        System.out.println(line);*/
	        i++;
	        
	    }
	    System.out.println(hashTable1);
	    System.out.println(hashTable2);
	    System.out.println(hashTable3);
	    
	    

	}


}