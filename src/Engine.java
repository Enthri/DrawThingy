import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Engine {
	
	private static ArrayList<Drawable> drawableList;
	private static JFrame frame;
	
	private static Snoo snoo;
	
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
				snoo.setX(this.getWidth()/2 - 110);
				snoo.setY(this.getHeight()/2 - 90);
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
		snoo = new Snoo(0, 0, 220, 180); 
		add(snoo);
		/*Timer timer = new Timer(10, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				snoo.rotate(5);
				frame.repaint();
			}
		});*/
		//timer.start();
	}
	
	public static void add(Drawable object) {
		drawableList.add(object);
		frame.repaint();
	}
}