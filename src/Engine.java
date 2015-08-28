import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
				for(Drawable object : drawableList) object.paint((Graphics2D) g);
			}
		});
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void add(Drawable object) {
		drawableList.add(object);
		frame.repaint();
	}
}