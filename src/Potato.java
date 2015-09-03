import java.awt.Color;
import java.awt.Graphics2D;


public class Potato implements Drawable{

	@Override
	public void paint(Graphics2D render) {
		Color potatoColor = new Color(255, 204, 102);
		render.setColor(potatoColor);
		
		
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
