import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Engine {
	
	private static ArrayList<Drawable> drawableList;
	private static JFrame frame;
	
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		drawableList = new ArrayList<Drawable>();
		frame = new JFrame("P1-StoefflerTroiRyan-ChenRyan"); //jframe
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setMinimumSize(new Dimension(300, 300)); //nope
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new JPanel(){
			@Override
			   public void paintComponent(Graphics g) {
			    Graphics2D render = (Graphics2D) g;
			    render.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			    for(Drawable object : drawableList) object.paint(render);
			   }
		});
		frame.pack();
		frame.setVisible(true);
		for(int y = 0; y <= frame.getHeight() + 5000; y += 50){
			for(int x = 0; x < frame.getHeight() + 200; x += 40){
				add(new Upvote(x, y));
			}
		}
		add(new Snoo(frame.getContentPane().getWidth()/2 - 110, frame.getContentPane().getHeight()/2 - 90, 220, 180));
		add (new CatHead(200, 100,3,3));
	}
	
	public static void add(Drawable object) {
		drawableList.add(object);
		frame.repaint();
	}
}