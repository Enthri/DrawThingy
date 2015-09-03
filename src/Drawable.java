/*
 * Troi-Ryan Stoeffler's awesome drawable type
 * It's beautiful isn't it?
 * 
 * The drawable interface, for types of objects that want to be drawn onto the custom frame
 * easily--maybe;
 */

import java.awt.Graphics2D;

public interface Drawable {
	
	public void paint(Graphics2D render); //create abstract methods to be inherited into the classes that implement tihs class
	public void setX(int x);
	public void setY(int y);
	public int getX();
	public int getY();
}
