package oop40;

public class StarTracker {
	
	private static int stars;
	public StarTracker(int stars) {
		this.stars = stars;
		}



	public static int getStars() {
		return stars;
	}


	public void setStars(int stars) {
		this.stars = stars;
	}


	public static void addStars(int var1){
	    stars=stars+var1; 
	}
	public static void useStars(int var1){
	    stars=stars-var1; 
	}

	public static void displayStars() {
		System.out.println(stars);
	}
	public static StarTracker starTrak = new StarTracker(0);
		
	
}
