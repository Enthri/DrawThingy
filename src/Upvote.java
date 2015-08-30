/*
 * Author: Ryan Chen
 * Date: August 29, 2015
 * Description: This is my Upvote class Mr. Steinke!!! I hope you like Reddit too.
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;


public class Upvote implements Drawable{
	private int x_global = 40;
	private int y_global = 0;
	private int[] arr_x = new int[7];
	private int[] arr_y = new int[7];
	
	public Upvote(int x, int y){
		arr_x[0] = x;
		arr_x[1] = x - 20;
		arr_x[2] = x - 10;
		arr_x[3] = arr_x[2];
		arr_x[4] = x + 10;
		arr_x[5] = arr_x[4];
		arr_x[6] = x + 20;
		
		arr_y[0] = y;
		arr_y[1] = y + 20;
		arr_y[2] = arr_y[1];
		arr_y[3] = y + 40;
		arr_y[4] = arr_y[3];
		arr_y[5] = arr_y[1];
		arr_y[6] = arr_y[1];
		
		x_global = x;
		y_global = y;
	}
	@Override
	public void paint(Graphics2D render) {
		Random rand = new Random();
		Color[] arr_c = new Color[]{Color.ORANGE, Color.BLUE, Color.RED, Color.GREEN};
		int cnum = rand.nextInt(4);
		createTriangle(render, arr_c[cnum]);
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
