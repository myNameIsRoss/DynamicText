package dynamicText;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

public class Alphabet implements Runnable{

	public static char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j', 'k', 'l', 'm'
			, 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v', 'w', 'x', 'y', 'z' };
	
	/*TODO - add characters to the end of alphabet - '!', '?' etc.*/
	
	Image charImg[] = new Image[alphabet.length]; ImageIcon letterIcon;
	
	private int textRows;
	private String rowContents[];
	
	Point textBoxOrigin;
	
	public Alphabet() {
		
		for(int character : alphabet) {
			
			letterIcon = new ImageIcon(getClass().getResource("/images/alphaBet/" + character + ".png"));
			charImg[character] = letterIcon.getImage();
		}
		
		Thread t = new Thread(this);
		t.start();
	
	}
	
	public void run() {

		while (true) {
	
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		
		/*Do the things*/

	}
}
