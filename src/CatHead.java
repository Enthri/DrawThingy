import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.util.Random;

public class CatHead implements Drawable{
	Random rand = new Random();
	int[] ear_1 = new int[]{};
	@Override
	public void paint(Graphics2D render) {
		AffineTransform oldTransform = render.getTransform();
		Triangle t = new Triangle(500, 100, 100);
		render.translate(t.getX(), t.getY());
		t.setX(-t.getLength()/2);
		t.setY(-t.getLength()/2);
		render.rotate(83);
		render.setColor(Color.BLACK);
		render.fill(t);
		render.draw(t);
		render.setTransform(oldTransform);
		
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
}
