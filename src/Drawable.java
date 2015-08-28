import java.awt.Graphics2D;


public interface Drawable {
	public void paint(Graphics2D render);
	public void setX(int x);
	public void setY(int y);
	public int getX();
	public int getY();
}
