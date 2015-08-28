import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Snoo implements Drawable {
	
	private int x, y, width, height;
	
	public Snoo(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void paint(Graphics2D render) {
		AffineTransform oldTransform = render.getTransform();
		render.translate(x, y);
		render.setTransform(oldTransform);
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}
}