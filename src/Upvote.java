import java.awt.Color;
import java.awt.Graphics2D;


public class Upvote implements Drawable{
	private int x_global = 40;
	private int y_global = 40;
	public Upvote(int x, int y, int width, int height){
		x_global = x;
		y_global = y;
	}
	public int[] arr_x = new int[]{x_global, x_global - 20, x_global - 10, x_global - 10, x_global + 10, x_global + 10, x_global + 20};
	public int[] arr_y = new int[]{y_global, y_global + 20, y_global + 20, y_global + 40, y_global + 40, y_global + 20, y_global + 20};
	@Override
	public void paint(Graphics2D render) {
		Color c = Color.ORANGE;
		createTriangle(render, c);
//		createStem(render, c, x_global, y_global, w_stem, h_stem);
	}
	
	public int[] getArrX(){
		return arr_x;
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
	
	public Upvote rotate() {
		
		return this;
	}
	public void createTriangle(Graphics2D r, Color c){
		r.setColor(c);
		r.fillPolygon(arr_x, arr_y, 7);
	}
	public void createStem(Graphics2D r, Color c, int x, int y, int w, int h) {
		r.setColor(c);
		r.fillRect(h, h, h, h);
		
	}
	public double midPoint(int x1, int x2, int y1, int y2){
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		return distance;
	}

}
