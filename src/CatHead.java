import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class CatHead implements Drawable{
	int x_global;
	int y_global;
	int w_e;
	int h_e;
	int x_globaladd50;
	int x_globaladd100;
	int y_globaladd80;
	public CatHead(int x, int y, int w, int h){
		x_global = x;
		y_global = y;
		x_globaladd50 = x +50;
		x_globaladd100 = x_global + 100;
		y_globaladd80 = y + 80;
		w_e = w;
		h_e = h;
	}
	@Override
	public void paint(Graphics2D render) {

		render.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
		Triangle t = new Triangle(x_global, y_global, 50);
		Triangle t2 = new Triangle(x_global + 100, y_global, 50);
		Ellipse2D e = new Ellipse2D.Double(x_global - 58, y_global + 30, 210, 100);
		render.setColor(Color.GRAY);
		render.fill(t);
		render.fill(t2);
		render.fill(e);
		render.setColor(Color.BLACK);
		render.draw(t2);
		render.draw(t);
		render.draw(e);
		
		Ellipse2D eye1 = new Ellipse2D.Double(x_global - 10, y_global + 50, 20, 20);
		Ellipse2D eye2 = new Ellipse2D.Double(x_global + 90, y_global + 50, 20, 20);
		render.setColor(Color.BLACK);
		render.fill(eye1);
		render.fill(eye2);
		render.setColor(Color.BLACK);
		render.draw(eye2);
		render.draw(eye1);
		
		Line2D LW1 = new Line2D.Double(x_globaladd50, y_globaladd80, x_globaladd100, y_global + 100);
		Line2D LW2 = new Line2D.Double(x_globaladd50, y_globaladd80, x_globaladd100, y_global + 80);
		Line2D LW3 = new Line2D.Double(x_globaladd50, y_globaladd80, x_globaladd100, y_global + 70); 
		Line2D RW1 = new Line2D.Double(x_globaladd50, y_globaladd80, x_global, y_global + 100);
		Line2D RW2 = new Line2D.Double(x_globaladd50, y_globaladd80, x_global, y_global + 80);
		Line2D RW3 = new Line2D.Double(x_globaladd50, y_globaladd80, x_global, y_global + 70);
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
		
		Ellipse2D nose = new Ellipse2D.Double(x_globaladd50, y_globaladd80, 10, 10);
		render.setColor(Color.PINK);
		render.fill(nose);
//		render.setColor(Color.BLACK);
		render.draw(nose);
		
		
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
