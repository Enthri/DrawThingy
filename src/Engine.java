import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Engine {
	
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		JFrame frame = new JFrame("P1-StoefflerTroiRyan-ChenRyan"); //jframe
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setMinimumSize(new Dimension(300, 300)); //nope 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new JPanel(){
			@Override
			public void paintComponent(Graphics g) {
				
			}
		});
		frame.pack();
		frame.setVisible(true);
	}
}