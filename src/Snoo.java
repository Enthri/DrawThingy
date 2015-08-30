import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

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
		render.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		render.translate(x, y);
		render.scale(2, 2);
		render.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		render.setPaint(Color.WHITE);
		Ellipse2D.Double head = new Ellipse2D.Double(15, 55, 180, 120);
		Ellipse2D.Double eye0 = new Ellipse2D.Double(60, 90, 30, 30);
		Ellipse2D.Double eye1 = new Ellipse2D.Double(120, 90, 30, 30);
		Arc2D.Double ear0 = new Arc2D.Double(5, 70, 35, 35, 50, 180, Arc2D.OPEN);
		Arc2D.Double ear1 = new Arc2D.Double(170, 70, 35, 35, 130, -190, Arc2D.OPEN);
		Path2D.Double antBase = new Path2D.Double();
		antBase.moveTo(105, 50);
		antBase.lineTo(120, 5);
		antBase.lineTo(162, 15);
		Ellipse2D.Double ant1 = new Ellipse2D.Double(162, 5, 32, 32);
		Arc2D.Double mouth = new Arc2D.Double(51.5, 45, 107, 107, 235, 70, Arc2D.OPEN);
		render.fill(ear0);
		render.fill(ear1);
		render.fill(ant1);
		render.fill(head);
		render.setPaint(Color.BLACK);
		render.draw(ear0);
		render.draw(ear1);
		render.draw(ant1);
		render.draw(antBase);
		render.draw(head);
		render.draw(mouth);
		render.setPaint(new Color(255, 69, 0));
		render.fill(eye0);
		render.fill(eye1);
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