import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;


public class Upvote implements Drawable{
	public int x;
	public int y;
	@Override
	public void paint(Graphics2D render) {
		Color c = Color.ORANGE;
		createTriangle(render, c);
	}

	@Override
	public void setX(int x) {
		
	}
	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}
	public void createTriangle(Graphics2D r, Color c){
		Polygon t = new Polygon();
		createStem(r, c);
	}
	public void createStem(Graphics2D r, Color c) {
		
		
	}	
}
