/*
 * Author(s): Ryan Chen
 * Date: Sepetember 02, 2015
 * Description: The V6 Engine of our program. VROOM VROOM!
 */
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
	
	//Here, various important parts of the program are initialized, such as the JFrame and the Snoo
	private static ArrayList<Drawable> drawableList;
	private static JFrame frame;
	private static Snoo snoo;
	
	//We don't like the yellow warnings in Eclipse, so we suppressed the warnings.
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		//This list is a list of the objects that use Drawable.
		drawableList = new ArrayList<Drawable>();
		frame = new JFrame("P1-StoefflerChen"); //jframe
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setMinimumSize(new Dimension(300, 300)); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new JPanel(){
			@Override
				//This paints the objects onto the content panel.
			   public void paintComponent(Graphics g) {
				try {
					snoo.setX(this.getWidth()/2 - 110);
					snoo.setY(this.getHeight()/2 - 150);
				    Graphics2D render = (Graphics2D) g;
				    render.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				    for(Drawable object : drawableList) if(object != null) object.paint(render);
				} catch(Exception e) { }
			}
		});
		frame.pack();
		frame.setVisible(true);
		//This creates ALOT of upvote arrows.
		for(int y = 0; y <= frame.getHeight() + 5000; y += 50){
			for(int x = 0; x < frame.getHeight() + 200; x += 40){
				add(new Upvote(x, y));
			}
		}
		//Here, the snoo is initialized.
		snoo = new Snoo(0, 0, 220, 300);
		add(snoo);
		//Here I create the CatHead
		CatHead c = new CatHead(200, 100,3,3);
		add(c);
		//This timer helps rotate the snoo and changes the colors of the arrows.
		Timer timer = new Timer(33, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				snoo.rotate(5);
				frame.repaint();
			}
		});
		timer.start();
	}
	//This method adds the objects to the List.
	public static void add(Drawable object) {
		drawableList.add(object);
		frame.repaint();
	}
}