package oop20;

public class GuessGameInput {
	static String resultText= "";
	static String aButtonText= "Guess";


	
	public static String[] GameInput(int value,int guessValue) {


            if(value<guessValue) {
            	resultText = ("your answer was too low!");
	            
            }
            else if(value>guessValue) {
            	resultText = ("your answer was too High!");
            }
            
            else if(value==guessValue) {
            	resultText = ("your answer was correct congratulations");
            	
            }




    	String[] returnString = new String[2];
    	returnString[0]= resultText;


    	
    	return returnString;
	}



}