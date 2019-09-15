package oop20;

import java.util.Random;

public class GuessGameRandom {

	static Random rand = new Random();
	  public static int ran() {

  	int guessValue = rand.nextInt(50+1);
  	
  	return guessValue;
		}
	  
	
}