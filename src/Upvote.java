import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


public class Upvote implements Drawable{
	private int x_global;
	private int y_global;
	public int[] arr_x = new int[]{40, 60, 80};
	public int[] arr_y = new int[]{40, 20, 20};
	@Override
	public void paint(Graphics2D render) {
		int w_stem = 50;
		int h_stem = 100;
		Color c = Color.ORANGE;
		createTriangle(render, c);
		createStem(render, c, x_global, y_global, w_stem, h_stem);
	}

	@Override
	public void setX(int x) {
		x_global = x;
	}
	@Override
	public void setY(int y) {
		y_global = y;
	}
	@Override
	public int getX() {
		return x_global;
	}

	@Override
	public int getY() {
		return y_global;
	}	
	public void createTriangle(Graphics2D r, Color c){
		r.drawPolygon(arr_x, arr_y, 3);
	}
	public void createStem(Graphics2D r, Color c, int x, int y, int w, int h) {
		Rectangle2D stem = new Rectangle2D.Double(w, h, x, y);
		r.draw(stem);
		
	}
	public double midPoint(int x1, int x2, int y1, int y2){
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		return distance;
	}

}
