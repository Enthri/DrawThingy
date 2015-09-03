/*
 * Author: Ryan Chen
 * Date: September 2nd, 2015
 * Description: This class draws the CatHead.
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class CatHead implements Drawable{
	//Here are the variables that govern where the cat goes.
	int x_global;
	int y_global;
	int w_e;
	int h_e;
	int x_globaladd50;
	int x_globaladd100;
	int y_globaladd80;
	
	//This is the constructor.
	public CatHead(int x, int y, int w, int h){
		x_global = x;
		y_global = y;
		x_globaladd50 = x_global + 50;
		x_globaladd100 = x_global + 100;
		y_globaladd80 = y + 80;
		w_e = w;
		h_e = h;
	}
	//This is the paint method, where the instructions to paint are contained.
	@Override
	public void paint(Graphics2D render) {
		//Here, I set the stroke to be larger than the normal stroke, for artistic purposes.
		render.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		//Here, I create the Triangles from the Triangle class I created.
		Triangle t = new Triangle(x_global, y_global, 50);
		Triangle t2 = new Triangle(x_global + 100, y_global, 50);
		//This ellipse will create the face.
		Ellipse2D e = new Ellipse2D.Double(x_global - 58, y_global + 30, 210, 100);
		render.setColor(Color.GRAY);
		render.fill(t);
		render.fill(t2);
		render.fill(e);
		render.setColor(Color.BLACK);
		render.draw(t2);
		render.draw(t);
		render.draw(e);
		//This block of code creates the eyes.
		Ellipse2D eye1 = new Ellipse2D.Double(x_global - 10, y_global + 50, 20, 20);
		Ellipse2D eye2 = new Ellipse2D.Double(x_global + 90, y_global + 50, 20, 20);
		render.setColor(Color.BLACK);
		render.fill(eye1);
		render.fill(eye2);
		render.setColor(Color.BLACK);
		render.draw(eye2);
		render.draw(eye1);
		//This block creates the whiskers.
		Line2D LW1 = new Line2D.Double(x_global + 50, y_globaladd80, x_global + 100, y_global + 100);
		Line2D LW2 = new Line2D.Double(x_global + 50, y_globaladd80, x_global + 100, y_global + 80);
		Line2D LW3 = new Line2D.Double(x_global + 50, y_globaladd80, x_global + 100, y_global + 70); 
		Line2D RW1 = new Line2D.Double(x_global + 50, y_globaladd80, x_global, y_global + 100);
		Line2D RW2 = new Line2D.Double(x_global + 50, y_globaladd80, x_global, y_global + 80);
		Line2D RW3 = new Line2D.Double(x_global + 50, y_globaladd80, x_global, y_global + 70);
		render.setColor(Color.black);
		render.fill(LW1);
		render.fill(LW2);
		render.fill(LW3);
		render.fill(RW1);
		render.fill(RW2);
		render.fill(RW3);
		render.setColor(Color.BLACK);
		render.draw(LW1);
		render.draw(LW2);
		render.draw(LW3);
		render.draw(RW1);
		render.draw(RW2);
		render.draw(RW3);
		//This block of code makes the nose.
		Ellipse2D nose = new Ellipse2D.Double(x_global + 50, y_globaladd80, 10, 10);
		render.setColor(Color.PINK);
		render.fill(nose);
		render.draw(nose);
	}
	//Obligatory accessory and mutator methods.
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
}
