package oop30;

import java.util.Random;

public class LottoRand {
	static Random rand = new Random();
	//random generation

   public static int[] ran() {
	
	   //number 1
	int guessValue1 = rand.nextInt(51);	  
	System.out.println(guessValue1);
	//number 2
	Random rand2 = new Random();
	int guessValue2 = rand2.nextInt(50)+1;
	if(guessValue2 == guessValue1 ) {
		while(guessValue2 == guessValue1 ) {
	    	guessValue2 = rand2.nextInt(50)+1;
		}

	}
	System.out.println(guessValue2);
	//number 3
	Random rand3 = new Random();
	int guessValue3 = rand3.nextInt(50)+1;
	if(guessValue3 == guessValue1 || guessValue3 == guessValue2  ) {
		while(guessValue3 == guessValue1 || guessValue3 == guessValue2  ) {
	    	guessValue3 = rand3.nextInt(50)+1;
		}

	}
	System.out.println(guessValue3);
	//number 4
	Random rand4 = new Random();
	int guessValue4 = rand4.nextInt(50)+1;
	if (guessValue4 == guessValue1 || guessValue4 == guessValue2  || guessValue4 == guessValue3 ) {
		while(guessValue4 == guessValue1 || guessValue4 == guessValue2  || guessValue4 == guessValue3 ) {
	    	guessValue4 = rand4.nextInt(50)+1;

		}

	}
	System.out.println(guessValue4);
	//number 5
	Random rand5 = new Random();
	int guessValue5 = rand5.nextInt(50)+1;
	if(guessValue5 == guessValue1 || guessValue5 == guessValue2  || guessValue5 == guessValue3 || guessValue5 == guessValue4 ) {
		while(guessValue5 == guessValue1 || guessValue5 == guessValue2  || guessValue5 == guessValue3 || guessValue5 == guessValue4 ) {
	    	guessValue5 = rand5.nextInt(50)+1;

		}
	}
	System.out.println(guessValue5);
	int[] arr = new int[5];
	arr[0]=guessValue1;
	arr[1]=guessValue2;
	arr[2]=guessValue3;
	arr[3]=guessValue4;
	arr[4]=guessValue5;
	
	return arr;
    }
	
}
