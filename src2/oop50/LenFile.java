package oop50;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LenFile {
	public static String[] lenfile() throws IOException  {

		BufferedReader bufferedReader = new BufferedReader(new FileReader("Prizes.txt"));
	    String line = "";
	
	    int i = 1;
	    while ((line = bufferedReader.readLine()) != null) {
	    	i=i+1;
    }

	    

    	String[] buttonAmt = new String[i];
        while (i!=0) {
        	Integer iVal = Integer.valueOf(i);

        	buttonAmt[i]= iVal.toString() ;
    		
    		
        }
        return buttonAmt;
  }
}