package dynamicText;

public class DisplayText {

	int characterSize = 30; /*Size of each character (width, height) in pixels*/
	
	int defaultJumpHeight = characterSize / 2;
	int defaultJumpSpeed = 0; /*TODO - an int to describe speed - complete the jump in x frames?*/
	
	
	/*Text will be displayed statically
	 * (I am aware that a method to display text in a static way is 
	 * in opposition to a program designed to display text dynamically)*/
	public void staticDisplay() {
		
	}
	
	/*Text will move up and down */
	public void jumpDisplay(int height, int speed) {
		
	}
	
	public void growAndShrinkDisplay() {
		
	}
	
	/*Defaults*/
	public void jumpDisplay() {
		jumpDisplay(defaultJumpHeight, defaultJumpSpeed);
	}
	
}
