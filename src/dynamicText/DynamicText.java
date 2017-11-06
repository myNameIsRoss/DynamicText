package dynamicText;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicText extends JFrame implements Runnable {

	public void paint(Graphics g) {
		
		
	}
	
	public void run() {
		
	while (true) {
		try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			
		this.repaint();
		}	
	}
	
	
	
	

}
