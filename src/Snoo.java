/*
 * Troi-Ryan Stoeffler's awesome snoo head
 * It's beautiful isn't it?
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;

public class Snoo implements Drawable {
	
	private int x, y, width, height;
	private double rotation = 0;
	private Ellipse2D.Double head;
	private Ellipse2D.Double eye0;
	private Ellipse2D.Double eye1;
	private Ellipse2D.Double ant1;
	private Arc2D.Double ear0;
	private Arc2D.Double ear1;
	private Arc2D.Double mouth;
	private Arc2D.Double torso;
	private Arc2D.Double arm0;
	private Arc2D.Double arm1;
	private Arc2D.Double foot0;
	private Arc2D.Double foot1;
	private Line2D.Double footU;
	private Path2D.Double antBase;
	
	public Snoo(int x, int y, int width, int height) { //default width and height is 220 by 180
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		head = new Ellipse2D.Double(15, 55, 180, 120);
		eye0 = new Ellipse2D.Double(60, 90, 30, 30);
		eye1 = new Ellipse2D.Double(120, 90, 30, 30);
		ear0 = new Arc2D.Double(5, 70, 35, 35, 50, 180, Arc2D.OPEN);
		ear1 = new Arc2D.Double(170, 70, 35, 35, 130, -190, Arc2D.OPEN);
		antBase = new Path2D.Double();
		antBase.moveTo(105, 50);
		antBase.lineTo(120, 5);
		antBase.lineTo(162, 15);
		ant1 = new Ellipse2D.Double(162, 5, 32, 32);
		mouth = new Arc2D.Double(51.5, 45, 107, 107, 235, 70, Arc2D.OPEN);
		torso = new Arc2D.Double(60, 110, 90, 190, 283, 334, Arc2D.CHORD);
		arm0 = new Arc2D.Double(35, 175, 65, 80, 110, 150, Arc2D.OPEN);
		arm1 = new Arc2D.Double(110, 175, 65, 80, 70, -150, Arc2D.OPEN);
		foot0 = new Arc2D.Double(45, 273, 45, 46, 180, -180, Arc2D.OPEN);
		foot1 = new Arc2D.Double(120, 273, 45, 46, 180, -180, Arc2D.OPEN);
		footU = new Line2D.Double(45, 297.5, 165, 297.5);
	}

	@Override
	public void paint(Graphics2D render) {
		AffineTransform oldTransform = render.getTransform();
		Stroke oldStroke = render.getStroke();
		render.translate(x, y);
		if(width != 0 || height != 0) render.scale(width / 220.0D, height / 300.0D);
		render.rotate(Math.toRadians(rotation), 105, 150);
		render.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		render.setPaint(Color.WHITE);
		render.fill(foot0);
		render.fill(foot1);
		render.setPaint(Color.BLACK);
		render.draw(foot0);
		render.draw(foot1);
		render.draw(footU);
		render.setPaint(Color.WHITE);
		render.fill(torso);
		render.fill(arm0);
		render.fill(arm1);
		render.setPaint(Color.BLACK);
		render.draw(torso);
		render.draw(arm0);
		render.draw(arm1);
		render.setPaint(Color.WHITE);
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
		render.setStroke(oldStroke);
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
	
	/**
	 * Increase rotation by set amount
	 * @param rotation
	 */
	public void rotate(double rotation) {
		this.rotation += rotation;
	}
}